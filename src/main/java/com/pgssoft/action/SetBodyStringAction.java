package com.pgssoft.action;

import com.pgssoft.HttpResponseProxy;

import java.io.IOException;

public final class SetBodyStringAction implements Action {

    private final String content;

    public SetBodyStringAction(String content) {
        this.content = content;
    }

    @Override
    public void enrichResponse(HttpResponseProxy.Builder responseBuilder) throws IOException {
        responseBuilder.setBody(content);
    }
}
