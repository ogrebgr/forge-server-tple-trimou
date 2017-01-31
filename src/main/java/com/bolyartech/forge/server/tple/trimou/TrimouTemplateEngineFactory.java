package com.bolyartech.forge.server.tple.trimou;

import com.bolyartech.forge.server.misc.TemplateEngine;
import com.bolyartech.forge.server.misc.TemplateEngineFactory;
import org.trimou.engine.MustacheEngine;
import org.trimou.engine.MustacheEngineBuilder;
import org.trimou.engine.locator.ClassPathTemplateLocator;


public class TrimouTemplateEngineFactory implements TemplateEngineFactory {
    private final MustacheEngine mEngine;


    public TrimouTemplateEngineFactory(String templatePathPrefix) {
        mEngine = MustacheEngineBuilder
                .newBuilder()
                .addTemplateLocator(new ClassPathTemplateLocator(1, templatePathPrefix))
                .build();

    }


    public TrimouTemplateEngineFactory(MustacheEngine engine) {
        mEngine = engine;
    }


    @Override
    public TemplateEngine createNew() {
        return new TrimouTemplateEngine(mEngine);
    }
}
