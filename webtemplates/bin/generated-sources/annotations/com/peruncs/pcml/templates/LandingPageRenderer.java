package com.peruncs.pcml.templates;

/**
 * Generated Renderer.
 */
// @javax.annotation.Generated("io.jstach.apt.GenerateRendererProcessor")
public class LandingPageRenderer implements io.jstach.jstachio.Template.EncodedTemplate<com.peruncs.pcml.templates.LandingPage>,
        io.jstach.jstachio.spi.TemplateProvider,
        io.jstach.jstachio.spi.JStachioFilter.FilterChain {
    /**
     * Template path.
     *
     * @hidden
     */
    public static final String TEMPLATE_PATH = "templates/app.html";

    /**
     * Inline template string copied.
     *
     * @hidden
     */

    public static final String TEMPLATE_STRING = "";

    /**
     * Template name. Do not rely on this.
     *
     * @hidden
     */
    public static final String TEMPLATE_NAME = "com.peruncs.pcml.templates.LandingPageRenderer";

    /**
     * Template charset.
     *
     * @hidden
     */
    public static final java.nio.charset.Charset TEMPLATE_CHARSET = java.nio.charset.StandardCharsets.UTF_8;

    /**
     * Template mediaType.
     *
     * @hidden
     */
    public static final String TEMPLATE_MEDIA_TYPE = "text/html";

    /**
     * The models class. Use {@link #modelClass()} instead.
     *
     * @hidden
     */
    public static final Class<?> MODEL_CLASS = com.peruncs.pcml.templates.LandingPage.class;

    /**
     * The instance. Use {@link {@link #of()} instead.
     *
     * @hidden
     */
    private static final LandingPageRenderer INSTANCE = new LandingPageRenderer();
    private static final byte[] TEXT_0 = (
            "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n" +
                    "\n" +
                    "    <!--\n" +
                    "        <script src=\"https://cdn.jsdelivr.net/npm/htmx.org@1.9.3/dist/htmx.min.js\" integrity=\"sha256-j1Z9IcvgVTZD20iGayN3o7u5JH+NkkQoACwrhH8osjw=\" crossorigin=\"anonymous\"></script>\n" +
                    "        <script defer src=\"https://cdn.jsdelivr.net/npm/alpinejs@3.x.x/dist/cdn.min.js\"></script>\n" +
                    "    -->\n" +
                    "\n" +
                    "    <script src=\"https://unpkg.com/htmx.org@1.9.4\" integrity=\"sha384-zUfuhFKKZCbHTY6aRR46gxiqszMk5tcHjsVFxnUo8VMus4kHGVdIYVbOYYNlKmHV\" crossorigin=\"anonymous\"></script>\n" +
                    "\n" +
                    "    <script crossorigin=\"anonymous\" src=\"https://unpkg.com/hyperscript.org@0.9.9\"></script>\n" +
                    "\n" +
                    "    <link href=\"web-assets/app.css\" rel=\"stylesheet\">\n" +
                    "    <title>PCML</title>\n" +
                    "</head>\n" +
                    "<body>\n").getBytes(TEMPLATE_CHARSET);
    private static final byte[] TEXT_1 = (
            "<p>Hello ").getBytes(TEMPLATE_CHARSET);
    private static final byte[] TEXT_2 = (
            "</p>\n").getBytes(TEMPLATE_CHARSET);
    private static final byte[] TEXT_3 = (
            "<ul>").getBytes(TEMPLATE_CHARSET);
    private static final byte[] TEXT_4 = (
            "\n" +
                    "    <li>Login date: ").getBytes(TEMPLATE_CHARSET);
    private static final byte[] TEXT_5 = (
            "</li>\n").getBytes(TEMPLATE_CHARSET);
    private static final byte[] TEXT_6 = (
            "</ul>\n").getBytes(TEMPLATE_CHARSET);
    private static final byte[] TEXT_7 = (
            "</body>\n" +
                    "</html>\n").getBytes(TEMPLATE_CHARSET);
    /**
     * Formatter.
     *
     * @hidden
     */
    private final io.jstach.jstachio.Formatter formatter;
    /**
     * Escaper.
     *
     * @hidden
     */
    private final io.jstach.jstachio.Escaper escaper;

    /**
     * Renderer constructor for manual wiring.
     *
     * @param formatter formatter if null the static formatter will be used.
     * @param escaper   escaper if null the static escaper will be used
     */
    public LandingPageRenderer(
            java.util.function./* @Nullable */ Function</* @Nullable */ Object, String> formatter,
            java.util.function./* @Nullable */ Function<String, String> escaper) {
        super();
        this.formatter = __formatter(formatter);
        this.escaper = __escaper(escaper);
    }

    /**
     * Renderer constructor for reflection (use of() instead).
     * For programmatic consider using {@link #of()} for a shared singleton.
     */
    public LandingPageRenderer() {
        this(null, null);
    }

    /**
     * Renderer constructor using config.
     *
     * @param templateConfig config that has collaborators
     */
    public LandingPageRenderer(io.jstach.jstachio.TemplateConfig templateConfig) {
        this(templateConfig.formatter(), templateConfig.escaper());
    }

    private static io.jstach.jstachio.Formatter __formatter(java.util.function./* @Nullable */ Function</* @Nullable */ Object, String> formatter) {
        return io.jstach.jstachio.Formatter.of(formatter != null ? formatter : io.jstach.jstachio.formatters.DefaultFormatter.provider());
    }

    private static io.jstach.jstachio.Escaper __escaper(java.util.function./* @Nullable */ Function<String, String> escaper) {
        return io.jstach.jstachio.Escaper.of(escaper != null ? escaper : io.jstach.jstachio.escapers.Html.provider());
    }

    /**
     * Convience static factory that will reuse the same singleton instance.
     *
     * @return renderer same as calling no-arg constructor but is cached with singleton instance
     */
    public static LandingPageRenderer of() {
        return INSTANCE;
    }

    /**
     * Renders the passed in model.
     *
     * @param <A>             appendable type.
     * @param <E>             error type.
     * @param data            model
     * @param unescapedWriter appendable to write to.
     * @param formatter       formats variables before they are passed to the escaper.
     * @param escaper         used to write escaped variables.
     * @param appender        used to write unescaped variables.
     * @throws E if an error occurs while writing to the appendable
     */
    public static <A extends io.jstach.jstachio.Output<E>, E extends Exception> void render(
            com.peruncs.pcml.templates.LandingPage data,
            A unescapedWriter,
            io.jstach.jstachio.Formatter formatter,
            io.jstach.jstachio.Appender escaper,
            io.jstach.jstachio.Appender appender) throws E {

        unescapedWriter.append(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n" +
                        "\n" +
                        "    <!--\n" +
                        "        <script src=\"https://cdn.jsdelivr.net/npm/htmx.org@1.9.3/dist/htmx.min.js\" integrity=\"sha256-j1Z9IcvgVTZD20iGayN3o7u5JH+NkkQoACwrhH8osjw=\" crossorigin=\"anonymous\"></script>\n" +
                        "        <script defer src=\"https://cdn.jsdelivr.net/npm/alpinejs@3.x.x/dist/cdn.min.js\"></script>\n" +
                        "    -->\n" +
                        "\n" +
                        "    <script src=\"https://unpkg.com/htmx.org@1.9.4\" integrity=\"sha384-zUfuhFKKZCbHTY6aRR46gxiqszMk5tcHjsVFxnUo8VMus4kHGVdIYVbOYYNlKmHV\" crossorigin=\"anonymous\"></script>\n" +
                        "\n" +
                        "    <script crossorigin=\"anonymous\" src=\"https://unpkg.com/hyperscript.org@0.9.9\"></script>\n" +
                        "\n" +
                        "    <link href=\"web-assets/app.css\" rel=\"stylesheet\">\n" +
                        "    <title>PCML</title>\n" +
                        "</head>\n" +
                        "<body>\n");

        // start SECTION. name: user, template: app
        /* RenderingContext: class io.jstach.apt.internal.context.DeclaredTypeRenderingContext */
        /* TypeMirror: com.peruncs.pcml.templates.LandingPage.User */
        if (data.user() != null) {

            unescapedWriter.append(
                    "<p>Hello ");

            // variable: name
            /* RenderingContext: class io.jstach.apt.internal.context.DeclaredTypeRenderingContext */
            /* TypeMirror: java.lang.String */
            formatter.format(escaper, unescapedWriter, "name", data.user().name());

            unescapedWriter.append(
                    "</p>\n");

            // start SECTION. name: loginHistory, template: app
            /* RenderingContext: class io.jstach.apt.internal.context.DeclaredTypeRenderingContext */
            /* TypeMirror: java.lang.String */
            if (data.user().loginHistory() != null) {
                int i = 0;
                for (java.util.Iterator<? extends java.lang.String> elementIt = data.user().loginHistory().iterator(); elementIt.hasNext(); i++) {
                    java.lang.String element = elementIt.next();

                    // start SECTION. name: -first, template: app
                    /* RenderingContext: class io.jstach.apt.internal.context.BooleanRenderingContext */
                    /* TypeMirror: java.lang.String */
                    if ((i == 0)) {

                        unescapedWriter.append(
                                "<ul>");
                    }
                    // end SECTION. name: -first, template: app

                    unescapedWriter.append(
                            "\n" +
                                    "    <li>Login date: ");

                    // variable: .
                    /* RenderingContext: class io.jstach.apt.internal.context.OwnedRenderingContext */
                    /* TypeMirror: java.lang.String */
                    formatter.format(escaper, unescapedWriter, ".", element);

                    unescapedWriter.append(
                            "</li>\n");

                    // start SECTION. name: -last, template: app
                    /* RenderingContext: class io.jstach.apt.internal.context.BooleanRenderingContext */
                    /* TypeMirror: java.lang.String */
                    if ((!elementIt.hasNext())) {

                        unescapedWriter.append(
                                "</ul>\n");
                    }
                    // end SECTION. name: -last, template: app
                }
            }
            // end SECTION. name: loginHistory, template: app
        }
        // end SECTION. name: user, template: app

        unescapedWriter.append(
                "</body>\n" +
                        "</html>\n");


    }

    /**
     * Renders to an OutputStream use pre-encoded parts of the template.
     *
     * @param <A>             output type.
     * @param <E>             error type.
     * @param data            model
     * @param unescapedWriter stream to write to.
     * @param formatter       formats variables before they are passed to the escaper.
     * @param escaper         used to write escaped variables.
     * @param appender        used to write unescaped variables.
     * @throws E if an error occurs while writing to the appendable
     */
    protected static <A extends io.jstach.jstachio.Output.EncodedOutput<E>, E extends Exception> void encode(
            com.peruncs.pcml.templates.LandingPage data,
            A unescapedWriter,
            io.jstach.jstachio.Formatter formatter,
            io.jstach.jstachio.Escaper escaper,
            io.jstach.jstachio.Appender appender) throws E {

        unescapedWriter.write(TEXT_0);

        // start SECTION. name: user, template: app
        /* RenderingContext: class io.jstach.apt.internal.context.DeclaredTypeRenderingContext */
        /* TypeMirror: com.peruncs.pcml.templates.LandingPage.User */
        if (data.user() != null) {

            unescapedWriter.write(TEXT_1);

            // variable: name
            /* RenderingContext: class io.jstach.apt.internal.context.DeclaredTypeRenderingContext */
            /* TypeMirror: java.lang.String */
            formatter.format(escaper, unescapedWriter, "name", data.user().name());

            unescapedWriter.write(TEXT_2);

            // start SECTION. name: loginHistory, template: app
            /* RenderingContext: class io.jstach.apt.internal.context.DeclaredTypeRenderingContext */
            /* TypeMirror: java.lang.String */
            if (data.user().loginHistory() != null) {
                int i = 0;
                for (java.util.Iterator<? extends java.lang.String> elementIt = data.user().loginHistory().iterator(); elementIt.hasNext(); i++) {
                    java.lang.String element = elementIt.next();

                    // start SECTION. name: -first, template: app
                    /* RenderingContext: class io.jstach.apt.internal.context.BooleanRenderingContext */
                    /* TypeMirror: java.lang.String */
                    if ((i == 0)) {

                        unescapedWriter.write(TEXT_3);
                    }
                    // end SECTION. name: -first, template: app

                    unescapedWriter.write(TEXT_4);

                    // variable: .
                    /* RenderingContext: class io.jstach.apt.internal.context.OwnedRenderingContext */
                    /* TypeMirror: java.lang.String */
                    formatter.format(escaper, unescapedWriter, ".", element);

                    unescapedWriter.write(TEXT_5);

                    // start SECTION. name: -last, template: app
                    /* RenderingContext: class io.jstach.apt.internal.context.BooleanRenderingContext */
                    /* TypeMirror: java.lang.String */
                    if ((!elementIt.hasNext())) {

                        unescapedWriter.write(TEXT_6);
                    }
                    // end SECTION. name: -last, template: app
                }
            }
            // end SECTION. name: loginHistory, template: app
        }
        // end SECTION. name: user, template: app

        unescapedWriter.write(TEXT_7);


    }

    @Override
    public StringBuilder execute(com.peruncs.pcml.templates.LandingPage model, StringBuilder sb) {
        render(model, io.jstach.jstachio.Output.of(sb), this.formatter, this.escaper, templateAppender());
        return sb;
    }

    @Override
    public <A extends io.jstach.jstachio.Output<E>, E extends Exception> A execute(
            com.peruncs.pcml.templates.LandingPage model,
            A a) throws E {
        render(model, a, this.formatter, this.escaper, templateAppender());
        return a;
    }

    /**
     * Renders the passed in model.
     *
     * @param <A>       appendable type.
     * @param <E>       error type.
     * @param model     a model assumed never to be <code>null</code>.
     * @param a         appendable to write to.
     * @param formatter formats variables before they are passed to the escaper
     * @param escaper   used to write escaped variables
     * @throws E if an error occurs while writing to the appendable
     */
    protected <A extends io.jstach.jstachio.Output<E>, E extends Exception> void execute(
            com.peruncs.pcml.templates.LandingPage model,
            A a,
            io.jstach.jstachio.Formatter formatter,
            io.jstach.jstachio.Escaper escaper) throws E {
        render(model, a, formatter, escaper, templateAppender());
    }

    @Override
    public <A extends io.jstach.jstachio.Output.EncodedOutput<E>, E extends Exception> A write(
            com.peruncs.pcml.templates.LandingPage model,
            A outputStream) throws E {
        encode(model, outputStream, this.formatter, this.escaper, templateAppender());
        return outputStream;
    }

    @Override
    public boolean supportsType(Class<?> type) {
        return MODEL_CLASS.isAssignableFrom(type);
    }

    /**
     * Needed for jstachio runtime.
     *
     * @hidden
     */
    @Override
    public java.util.List<io.jstach.jstachio.Template<?>> provideTemplates(io.jstach.jstachio.TemplateConfig templateConfig) {
        return java.util.List.of(io.jstach.jstachio.TemplateConfig.empty() == templateConfig ? INSTANCE : new LandingPageRenderer(templateConfig));
    }

    @Override
    public String templatePath() {
        return TEMPLATE_PATH;
    }

    @Override
    public String templateName() {
        return TEMPLATE_NAME;
    }

    @Override
    public java.nio.charset.Charset templateCharset() {
        return TEMPLATE_CHARSET;
    }

    @Override
    public String templateMediaType() {
        return TEMPLATE_MEDIA_TYPE;
    }

    @Override
    public String templateString() {
        return TEMPLATE_STRING;
    }

    @Override
    public Class<?> templateContentType() {
        return io.jstach.jstachio.escapers.Html.class;
    }

    @Override
    public io.jstach.jstachio.Escaper templateEscaper() {
        return this.escaper;
    }

    @Override
    public io.jstach.jstachio.Formatter templateFormatter() {
        return this.formatter;
    }

    /**
     * Appender.
     *
     * @return appender for writing unescaped variables.
     */
    public io.jstach.jstachio.Appender templateAppender() {
        return io.jstach.jstachio.Appender.defaultAppender();
    }

    /**
     * Model class.
     *
     * @return class used as model (annotated with JStache).
     */
    @Override
    public Class<?> modelClass() {
        return MODEL_CLASS;
    }

    /**
     * Needed for jstachio runtime.
     *
     * @hidden
     */
    @Override
    public void process(Object model, Appendable appendable) throws java.io.IOException {
        execute((com.peruncs.pcml.templates.LandingPage) model, appendable);
    }

    /**
     * Needed for jstachio runtime.
     *
     * @hidden
     */
    @Override
    public boolean isBroken(Object model) {
        return !supportsType(model.getClass());
    }
}
