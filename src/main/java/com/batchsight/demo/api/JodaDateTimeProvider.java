package com.batchsight.demo.api;

import com.sun.jersey.core.spi.component.ComponentContext;
import com.sun.jersey.spi.inject.Injectable;
import com.sun.jersey.spi.inject.PerRequestTypeInjectableProvider;

import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import org.joda.time.DateTime;
import java.util.List;

@Provider
public class JodaDateTimeProvider extends PerRequestTypeInjectableProvider<QueryParam, DateTime> {
    private final UriInfo uriInfo;

    public JodaDateTimeProvider(@Context UriInfo uriInfo) {
        super(DateTime.class);
        this.uriInfo = uriInfo;
    }

    @Override
    public Injectable<DateTime> getInjectable(final ComponentContext cc, final QueryParam a) {
        return new Injectable<DateTime>() {
            @Override
            public DateTime getValue() {
                final List<String> values = uriInfo.getQueryParameters().get(a.value());

                if (values == null || values.isEmpty())
                    return null;
                if (values.size() > 1) {
                    throw new WebApplicationException(Response.status(Status.BAD_REQUEST).
                            entity(a.value() + " cannot contain multiple values").build());
                }

                return DateTime.parse(values.get(0));
            }
        };
    }
}