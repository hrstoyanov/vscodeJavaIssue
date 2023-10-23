//Temporarily moved the annotation from the module to the package, until the Gradle team fixes this: https://github.com/gradle/gradle/issues/26147
@JStacheConfig(
        pathing = @JStachePath(prefix = "templates/", suffix = ".html"),
        contentType = Html.class,
        charset = "UTF-8")
package com.peruncs.pcml.templates;

import io.jstach.jstache.JStacheConfig;
import io.jstach.jstache.JStachePath;
import io.jstach.jstachio.escapers.Html;
