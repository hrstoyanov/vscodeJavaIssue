//Temporarily moved the annotation from the module to the package, until the Gradle team fixes this: https://github.com/gradle/gradle/issues/26147
//@JStacheConfig(
//        pathing = @JStachePath(prefix = "templates/", suffix = ".html"),
//        contentType = Html.class,
//        charset = "UTF-8")
module com.peruncs.pcml.webtemplates {
    requires transitive io.jstach.jstachio;
    exports com.peruncs.pcml.templates;
}
