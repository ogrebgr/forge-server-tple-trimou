package com.bolyartech.forge.server.tple.trimou;

import com.bolyartech.forge.server.misc.TemplateEngine;
import org.trimou.engine.MustacheEngine;

import java.util.HashMap;
import java.util.Map;


public class TrimouTemplateEngine implements TemplateEngine {
    private final MustacheEngine mEngine;
    private final Map<String, Object> mAttributes = new HashMap<>();


    public TrimouTemplateEngine(MustacheEngine engine) {
        mEngine = engine;
    }


    @Override
    public void assign(String varName, Object object) {
        mAttributes.put(varName, object);
    }


    @Override
    public String render(String templateName) {
        return mEngine.getMustache(templateName).render(mAttributes);
    }
}
