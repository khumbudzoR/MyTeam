package com.example.codetribe.deidrekhumbudzo;

/**
 * Created by codetribe on 8/1/2017.
 */


public class ImageUpload {

    public String name;
    public String url;
    public String description;
    public String whatwedo;
    protected String program;
    public String getName() {
        return name;
    }
    public String getWhatwedo() {
        return whatwedo;
    }
    public String getProgram() {
        return program;
    }
    public String getUrl() {
        return url;
    }

    public ImageUpload(String name, String url, String description,String whatwedo,String program) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.whatwedo=whatwedo;
        this.program=program;
    }

    public String getDescription() {
        return description;
    }

    public ImageUpload(){}
}
