package edu.illinois.library.cantaloupe.config;

/**
 * <p>To add a key:</p>
 *
 * <ol>
 *     <li>Add a value for it here.</li>
 *     <li>Add it to the sample config file.</li>
 *     <li>Document the addition in the upgrade guide.</li>
 *     <li>Add a form element to the Control Panel to set its value.</li>
 *     <li>Test the above.</li>
 * </ol>
 */
public enum Key {

    ACCESS_LOG_CONSOLEAPPENDER_ENABLED("log.access.ConsoleAppender.enabled"),
    ACCESS_LOG_FILEAPPENDER_ENABLED("log.access.FileAppender.enabled"),
    ACCESS_LOG_FILEAPPENDER_PATHNAME("log.access.FileAppender.pathname"),
    ACCESS_LOG_ROLLINGFILEAPPENDER_ENABLED("log.access.RollingFileAppender.enabled"),
    ACCESS_LOG_ROLLINGFILEAPPENDER_PATHNAME("log.access.RollingFileAppender.pathname"),
    ACCESS_LOG_ROLLINGFILEAPPENDER_POLICY("log.access.RollingFileAppender.policy"),
    ACCESS_LOG_ROLLINGFILEAPPENDER_FILENAME_PATTERN("log.access.RollingFileAppender.TimeBasedRollingPolicy.filename_pattern"),
    ACCESS_LOG_ROLLINGFILEAPPENDER_MAX_HISTORY("log.access.RollingFileAppender.TimeBasedRollingPolicy.max_history"),
    ACCESS_LOG_SYSLOGAPPENDER_ENABLED("log.access.SyslogAppender.enabled"),
    ACCESS_LOG_SYSLOGAPPENDER_HOST("log.access.SyslogAppender.host"),
    ACCESS_LOG_SYSLOGAPPENDER_PORT("log.access.SyslogAppender.port"),
    ACCESS_LOG_SYSLOGAPPENDER_FACILITY("log.access.SyslogAppender.facility"),
    ADMIN_ENABLED("endpoint.admin.enabled"),
    ADMIN_SECRET("endpoint.admin.secret"),
    ADMIN_USERNAME("endpoint.admin.username"),
    API_ENABLED("endpoint.api.enabled"),
    API_SECRET("endpoint.api.secret"),
    API_USERNAME("endpoint.api.username"),
    APPLICATION_LOG_LEVEL("log.application.level"),
    APPLICATION_LOG_CONSOLEAPPENDER_ENABLED("log.application.ConsoleAppender.enabled"),
    APPLICATION_LOG_FILEAPPENDER_ENABLED("log.application.FileAppender.enabled"),
    APPLICATION_LOG_FILEAPPENDER_PATHNAME("log.application.FileAppender.pathname"),
    APPLICATION_LOG_ROLLINGFILEAPPENDER_ENABLED("log.application.RollingFileAppender.enabled"),
    APPLICATION_LOG_ROLLINGFILEAPPENDER_PATHNAME("log.application.RollingFileAppender.pathname"),
    APPLICATION_LOG_ROLLINGFILEAPPENDER_POLICY("log.application.RollingFileAppender.policy"),
    APPLICATION_LOG_ROLLINGFILEAPPENDER_FILENAME_PATTERN("log.application.RollingFileAppender.TimeBasedRollingPolicy.filename_pattern"),
    APPLICATION_LOG_ROLLINGFILEAPPENDER_MAX_HISTORY("log.application.RollingFileAppender.TimeBasedRollingPolicy.max_history"),
    APPLICATION_LOG_SYSLOGAPPENDER_ENABLED("log.application.SyslogAppender.enabled"),
    APPLICATION_LOG_SYSLOGAPPENDER_HOST("log.application.SyslogAppender.host"),
    APPLICATION_LOG_SYSLOGAPPENDER_PORT("log.application.SyslogAppender.port"),
    APPLICATION_LOG_SYSLOGAPPENDER_FACILITY("log.application.SyslogAppender.facility"),
    AZURESTORAGECACHE_ACCOUNT_KEY("AzureStorageCache.account_key"),
    AZURESTORAGECACHE_ACCOUNT_NAME("AzureStorageCache.account_name"),
    AZURESTORAGECACHE_CONTAINER_NAME("AzureStorageCache.container_name"),
    AZURESTORAGECACHE_OBJECT_KEY_PREFIX("AzureStorageCache.object_key_prefix"),
    AZURESTORAGESOURCE_ACCOUNT_KEY("AzureStorageSource.account_key"),
    AZURESTORAGESOURCE_ACCOUNT_NAME("AzureStorageSource.account_name"),
    AZURESTORAGESOURCE_CONTAINER_NAME("AzureStorageSource.container_name"),
    AZURESTORAGESOURCE_LOOKUP_STRATEGY("AzureStorageSource.lookup_strategy"),
    BASE_URI("base_uri"),
    CACHE_SERVER_PURGE_MISSING("cache.server.purge_missing"),
    CACHE_SERVER_RESOLVE_FIRST("cache.server.resolve_first"),
    CACHE_WORKER_ENABLED("cache.server.worker.enabled"),
    CACHE_WORKER_INTERVAL("cache.server.worker.interval"),
    CLIENT_CACHE_ENABLED("cache.client.enabled"),
    CLIENT_CACHE_MAX_AGE("cache.client.max_age"),
    CLIENT_CACHE_MUST_REVALIDATE("cache.client.must_revalidate"),
    CLIENT_CACHE_NO_CACHE("cache.client.no_cache"),
    CLIENT_CACHE_NO_STORE("cache.client.no_store"),
    CLIENT_CACHE_NO_TRANSFORM("cache.client.no_transform"),
    CLIENT_CACHE_PRIVATE("cache.client.private"),
    CLIENT_CACHE_PROXY_REVALIDATE("cache.client.proxy_revalidate"),
    CLIENT_CACHE_PUBLIC("cache.client.public"),
    CLIENT_CACHE_SHARED_MAX_AGE("cache.client.shared_max_age"),
    DELEGATE_METHOD_INVOCATION_CACHE_ENABLED("delegate_script.cache.enabled"),
    DELEGATE_SCRIPT_ENABLED("delegate_script.enabled"),
    DELEGATE_SCRIPT_PATHNAME("delegate_script.pathname"),
    DERIVATIVE_CACHE("cache.server.derivative"),
    DERIVATIVE_CACHE_ENABLED("cache.server.derivative.enabled"),
    DERIVATIVE_CACHE_TTL("cache.server.derivative.ttl_seconds"),
    ERROR_LOG_FILEAPPENDER_ENABLED("log.error.FileAppender.enabled"),
    ERROR_LOG_FILEAPPENDER_PATHNAME("log.error.FileAppender.pathname"),
    ERROR_LOG_ROLLINGFILEAPPENDER_ENABLED("log.error.RollingFileAppender.enabled"),
    ERROR_LOG_ROLLINGFILEAPPENDER_PATHNAME("log.error.RollingFileAppender.pathname"),
    ERROR_LOG_ROLLINGFILEAPPENDER_POLICY("log.error.RollingFileAppender.policy"),
    ERROR_LOG_ROLLINGFILEAPPENDER_FILENAME_PATTERN("log.error.RollingFileAppender.TimeBasedRollingPolicy.filename_pattern"),
    ERROR_LOG_ROLLINGFILEAPPENDER_MAX_HISTORY("log.error.RollingFileAppender.TimeBasedRollingPolicy.max_history"),
    FFMPEGPROCESSOR_PATH_TO_BINARIES("FfmpegProcessor.path_to_binaries"),
    FILESYSTEMCACHE_DIRECTORY_DEPTH("FilesystemCache.dir.depth"),
    FILESYSTEMCACHE_DIRECTORY_NAME_LENGTH("FilesystemCache.dir.name_length"),
    FILESYSTEMCACHE_PATHNAME("FilesystemCache.pathname"),
    FILESYSTEMSOURCE_LOOKUP_STRATEGY("FilesystemSource.lookup_strategy"),
    FILESYSTEMSOURCE_PATH_PREFIX("FilesystemSource.BasicLookupStrategy.path_prefix"),
    FILESYSTEMSOURCE_PATH_SUFFIX("FilesystemSource.BasicLookupStrategy.path_suffix"),
    GRAPHICSMAGICKPROCESSOR_PATH_TO_BINARIES("GraphicsMagickProcessor.path_to_binaries"),
    HEAPCACHE_PATHNAME("HeapCache.persist.filesystem.pathname"),
    HEAPCACHE_PERSIST("HeapCache.persist"),
    HEAPCACHE_TARGET_SIZE("HeapCache.target_size"),
    HTTP_ACCEPT_QUEUE_LIMIT("http.accept_queue_limit"),
    HTTP_ENABLED("http.enabled"),
    HTTP_HTTP2_ENABLED("http.http2.enabled"),
    HTTP_HOST("http.host"),
    HTTP_PORT("http.port"),
    HTTPSOURCE_BASIC_AUTH_SECRET("HttpSource.BasicLookupStrategy.auth.basic.secret"),
    HTTPSOURCE_BASIC_AUTH_USERNAME("HttpSource.BasicLookupStrategy.auth.basic.username"),
    HTTPSOURCE_LOOKUP_STRATEGY("HttpSource.lookup_strategy"),
    HTTPSOURCE_REQUEST_TIMEOUT("HttpSource.request_timeout"),
    HTTPSOURCE_TRUST_ALL_CERTS("HttpSource.trust_all_certs"),
    HTTPSOURCE_URL_PREFIX("HttpSource.BasicLookupStrategy.url_prefix"),
    HTTPSOURCE_URL_SUFFIX("HttpSource.BasicLookupStrategy.url_suffix"),
    HTTPS_ENABLED("https.enabled"),
    HTTPS_HOST("https.host"),
    HTTPS_HTTP2_ENABLED("https.http2.enabled"),
    HTTPS_KEY_PASSWORD("https.key_password"),
    HTTPS_KEY_STORE_PASSWORD("https.key_store_password"),
    HTTPS_KEY_STORE_PATH("https.key_store_path"),
    HTTPS_KEY_STORE_TYPE("https.key_store_type"),
    HTTPS_PORT("https.port"),
    IIIF_1_ENDPOINT_ENABLED("endpoint.iiif.1.enabled"),
    IIIF_2_ENDPOINT_ENABLED("endpoint.iiif.2.enabled"),
    IIIF_2_RESTRICT_TO_SIZES("endpoint.iiif.2.restrict_to_sizes"),
    IIIF_CONTENT_DISPOSITION("endpoint.iiif.content_disposition"),
    IIIF_MIN_SIZE("endpoint.iiif.min_size"),
    IIIF_MIN_TILE_SIZE("endpoint.iiif.min_tile_size"),
    IMAGEMAGICKPROCESSOR_PATH_TO_BINARIES("ImageMagickProcessor.path_to_binaries"),
    INFO_CACHE_ENABLED("cache.server.info.enabled"),
    JDBCCACHE_CONNECTION_TIMEOUT("JdbcCache.connection_timeout"),
    JDBCCACHE_DERIVATIVE_IMAGE_TABLE("JdbcCache.derivative_image_table"),
    JDBCCACHE_INFO_TABLE("JdbcCache.info_table"),
    JDBCCACHE_JDBC_URL("JdbcCache.url"),
    JDBCCACHE_PASSWORD("JdbcCache.password"),
    JDBCCACHE_USER("JdbcCache.user"),
    JDBCSOURCE_CONNECTION_TIMEOUT("JdbcSource.connection_timeout"),
    JDBCSOURCE_JDBC_URL("JdbcSource.url"),
    JDBCSOURCE_PASSWORD("JdbcSource.password"),
    JDBCSOURCE_USER("JdbcSource.user"),
    KAKADUDEMOPROCESSOR_PATH_TO_BINARIES("KakaduDemoProcessor.path_to_binaries"),
    MAX_PIXELS("max_pixels"),
    OPENJPEGPROCESSOR_PATH_TO_BINARIES("OpenJpegProcessor.path_to_binaries"),
    OVERLAY_ENABLED("overlays.enabled"),
    OVERLAY_IMAGE("overlays.BasicStrategy.image"),
    OVERLAY_INSET("overlays.BasicStrategy.inset"),
    OVERLAY_OUTPUT_HEIGHT_THRESHOLD("overlays.BasicStrategy.output_height_threshold"),
    OVERLAY_OUTPUT_WIDTH_THRESHOLD("overlays.BasicStrategy.output_width_threshold"),
    OVERLAY_POSITION("overlays.BasicStrategy.position"),
    OVERLAY_STRATEGY("overlays.strategy"),
    OVERLAY_STRING_BACKGROUND_COLOR("overlays.BasicStrategy.string.background.color"),
    OVERLAY_STRING_COLOR("overlays.BasicStrategy.string.color"),
    OVERLAY_STRING_FONT("overlays.BasicStrategy.string.font"),
    OVERLAY_STRING_FONT_MIN_SIZE("overlays.BasicStrategy.string.font.min_size"),
    OVERLAY_STRING_FONT_SIZE("overlays.BasicStrategy.string.font.size"),
    OVERLAY_STRING_FONT_WEIGHT("overlays.BasicStrategy.string.font.weight"),
    OVERLAY_STRING_GLYPH_SPACING("overlays.BasicStrategy.string.glyph_spacing"),
    OVERLAY_STRING_STRING("overlays.BasicStrategy.string"),
    OVERLAY_STRING_STROKE_COLOR("overlays.BasicStrategy.string.stroke.color"),
    OVERLAY_STRING_STROKE_WIDTH("overlays.BasicStrategy.string.stroke.width"),
    OVERLAY_TYPE("overlays.BasicStrategy.type"),
    PRINT_STACK_TRACE_ON_ERROR_PAGES("print_stack_trace_on_error_pages"),
    PROCESSOR_BACKGROUND_COLOR("processor.background_color"),
    PROCESSOR_DOWNSCALE_FILTER("processor.downscale_filter"),
    PROCESSOR_DPI("processor.dpi"),
    PROCESSOR_FALLBACK("processor.fallback"),
    PROCESSOR_FALLBACK_RETRIEVAL_STRATEGY("processor.fallback_retrieval_strategy"),
    PROCESSOR_JPG_PROGRESSIVE("processor.jpg.progressive"),
    PROCESSOR_JPG_QUALITY("processor.jpg.quality"),
    PROCESSOR_NORMALIZE("processor.normalize"),
    PROCESSOR_PRESERVE_METADATA("processor.metadata.preserve"),
    PROCESSOR_RESPECT_ORIENTATION("processor.metadata.respect_orientation"),
    PROCESSOR_SELECTION_STRATEGY("processor.selection_strategy"),
    PROCESSOR_SHARPEN("processor.sharpen"),
    PROCESSOR_STREAM_RETRIEVAL_STRATEGY("processor.stream_retrieval_strategy"),
    PROCESSOR_TIF_COMPRESSION("processor.tif.compression"),
    PROCESSOR_UPSCALE_FILTER("processor.upscale_filter"),
    REDACTION_ENABLED("redaction.enabled"),
    REDISCACHE_DATABASE("RedisCache.database"),
    REDISCACHE_HOST("RedisCache.host"),
    REDISCACHE_PASSWORD("RedisCache.password"),
    REDISCACHE_PORT("RedisCache.port"),
    REDISCACHE_SSL("RedisCache.ssl"),
    SOURCE_DELEGATE("source.delegate"),
    SOURCE_STATIC("source.static"),
    S3CACHE_ACCESS_KEY_ID("S3Cache.access_key_id"),
    S3CACHE_BUCKET_NAME("S3Cache.bucket.name"),
    S3CACHE_ENDPOINT("S3Cache.endpoint"),
    S3CACHE_MAX_CONNECTIONS("S3Cache.max_connections"),
    S3CACHE_OBJECT_KEY_PREFIX("S3Cache.object_key_prefix"),
    S3CACHE_SECRET_KEY("S3Cache.secret_key"),
    S3SOURCE_ACCESS_KEY_ID("S3Source.access_key_id"),
    S3SOURCE_BUCKET_NAME("S3Source.BasicLookupStrategy.bucket.name"),
    S3SOURCE_ENDPOINT("S3Source.endpoint"),
    S3SOURCE_LOOKUP_STRATEGY("S3Source.lookup_strategy"),
    S3SOURCE_MAX_CONNECTIONS("S3Source.max_connections"),
    S3SOURCE_PATH_PREFIX("S3Source.BasicLookupStrategy.path_prefix"),
    S3SOURCE_PATH_SUFFIX("S3Source.BasicLookupStrategy.path_suffix"),
    S3SOURCE_SECRET_KEY("S3Source.secret_key"),
    SLASH_SUBSTITUTE("slash_substitute"),
    SOURCE_CACHE("cache.server.source"),
    SOURCE_CACHE_TTL("cache.server.source.ttl_seconds"),
    TEMP_PATHNAME("temp_pathname");

    private String key;

    Key(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }

    public String toString() {
        return key();
    }

}
