package io.opentelemetry.kotlin.export

import io.opentelemetry.kotlin.ExperimentalApi

/** OTLP HTTP request compression. */
@ExperimentalApi
public enum class OtlpHttpCompression { GZIP, NONE }
