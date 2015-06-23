/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gdgtresrios.sicomerciows.resource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Provider
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public final class GsonMessageBodyHandler implements MessageBodyWriter,
        MessageBodyReader {

    private static final String UTF_8 = "UTF-8";

    private Gson gson;

    private Gson getGson() {
        if (gson == null) {
            final GsonBuilder gsonBuilder = new GsonBuilder();
            gson = gsonBuilder.create();
        }
        return gson;
    }

    @Override
    public boolean isReadable(Class type, Type genericType,
            java.lang.annotation.Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    /*@Override
     public Object readFrom(Class<Object> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws Exception, ApplicationException {
     InputStreamReader streamReader = new InputStreamReader(entityStream, UTF_8);
     try {
     Type jsonType;
     if (type.equals(genericType)) {
     jsonType = type;
     } else {
     jsonType = genericType;
     }
     return getGson().fromJson(streamReader, jsonType);
     } finally {
     streamReader.close();
     }
     }*/
    
    @Override
    public boolean isWriteable(Class type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    @Override
    public long getSize(Object object, Class type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(Object object, Class type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        try (OutputStreamWriter writer = new OutputStreamWriter(entityStream, UTF_8)) {
            Type jsonType;
            if (type.equals(genericType)) {
                jsonType = type;
            } else {
                jsonType = genericType;
            }
            getGson().toJson(object, jsonType, writer);
        }
    }

    @Override
    public Object readFrom(Class type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap httpHeaders, InputStream entityStream) throws IOException, WebApplicationException {
        try (InputStreamReader streamReader = new InputStreamReader(entityStream, UTF_8)) {
            Type jsonType;
            if (type.equals(genericType)) {
                jsonType = type;
            } else {
                jsonType = genericType;
            }
            return getGson().fromJson(streamReader, jsonType);
        }

    }
}
