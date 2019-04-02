package com.ronasoft.familytracking.commons;

import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class GlobalGson {

    private Gson gson = new Gson();

    private static final GlobalGson globalGson = new GlobalGson();

    public static GlobalGson get() {
        return globalGson;
    }

    private GlobalGson() {

    }

    public Gson getGson() {
        if (gson == null) {
            gson = new Gson();
        }
        return gson;
    }

    public <T> String toJson(@NonNull final T t) {
        return getGson().toJson(t);
    }

    public <T> JsonObject getAsJsonObject(@NonNull final T t) {
        return getGson().toJsonTree(t).getAsJsonObject();
    }

    public <T> T fromJson(@NonNull final String o, @NonNull Class<T> tClass) {
        return getGson().fromJson(o, tClass);
    }

    public <T> T fromJson(@NonNull final JsonElement o, @NonNull Class<T> tClass) {
        return getGson().fromJson(o, tClass);
    }

    public <E> ArrayList<E> listFromJson(@NonNull final String o, @NonNull final Type listType) {
        return getGson().fromJson(o, listType);
    }

    public <E> ArrayList<E> listFromJson(@NonNull final JsonElement o, @NonNull final Type listType) {
        return getGson().fromJson(o, listType);
    }

    public <E> ArrayList<E> listFromJson(@NonNull final String o, @NonNull final Class<E> eClass) {
        return getGson().fromJson(o, new ListType<>(eClass));
    }

    public <E> ArrayList<E> listFromJson(@NonNull final JsonElement o, @NonNull final Class<E> eClass) {
        return getGson().fromJson(o, new ListType<>(eClass));
    }

    private static class ListType<E> implements ParameterizedType {

        private Class<?> wrapped;

        private ListType(Class<E> wrapped) {
            this.wrapped = wrapped;
        }

        public Type[] getActualTypeArguments() {
            return new Type[]{wrapped};
        }

        public Type getRawType() {
            return ArrayList.class;
        }

        public Type getOwnerType() {
            return null;
        }
    }
}