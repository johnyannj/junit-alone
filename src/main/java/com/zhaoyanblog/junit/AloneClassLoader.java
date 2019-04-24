package com.zhaoyanblog.junit;

import java.net.URLClassLoader;

/**
 * alone classloader
 *
 * @author johnyannj
 */
public class AloneClassLoader extends URLClassLoader {

    private ClassLoader appClassLoader;

    public AloneClassLoader() {
        super(((URLClassLoader) getSystemClassLoader()).getURLs(),
                Thread.currentThread().getContextClassLoader().getParent());
        appClassLoader = Thread.currentThread().getContextClassLoader();
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if (name.startsWith("org.junit.") || name.startsWith("junit.")) {
            return appClassLoader.loadClass(name);
        }

        return super.loadClass(name);
    }
}
