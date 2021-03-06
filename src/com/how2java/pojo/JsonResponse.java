package com.how2java.pojo;

public class JsonResponse<T> {
    private int statusCode;
    private String message;
    private T data;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JsonResponse() {
    }

    public JsonResponse(int statusCode, String message, T data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }
    public JsonResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

}
