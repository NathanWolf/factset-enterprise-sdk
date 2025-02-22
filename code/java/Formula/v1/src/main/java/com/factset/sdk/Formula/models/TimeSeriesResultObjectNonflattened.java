/*
 * FactSet Formula API
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
 *
 * The version of the OpenAPI document: 1.7.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Formula.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattenedArray;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattenedMatrix;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattenedScalar;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattenedTimeseriesObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Formula.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.factset.sdk.Formula.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

@JsonDeserialize(using = TimeSeriesResultObjectNonflattened.TimeSeriesResultObjectNonflattenedDeserializer.class)
@JsonSerialize(using = TimeSeriesResultObjectNonflattened.TimeSeriesResultObjectNonflattenedSerializer.class)
public class TimeSeriesResultObjectNonflattened extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(TimeSeriesResultObjectNonflattened.class.getName());

    public static class TimeSeriesResultObjectNonflattenedSerializer extends StdSerializer<TimeSeriesResultObjectNonflattened> {
        public TimeSeriesResultObjectNonflattenedSerializer(Class<TimeSeriesResultObjectNonflattened> t) {
            super(t);
        }

        public TimeSeriesResultObjectNonflattenedSerializer() {
            this(null);
        }

        @Override
        public void serialize(TimeSeriesResultObjectNonflattened value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class TimeSeriesResultObjectNonflattenedDeserializer extends StdDeserializer<TimeSeriesResultObjectNonflattened> {
        public TimeSeriesResultObjectNonflattenedDeserializer() {
            this(TimeSeriesResultObjectNonflattened.class);
        }

        public TimeSeriesResultObjectNonflattenedDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public TimeSeriesResultObjectNonflattened deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            TimeSeriesResultObjectNonflattened newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened();
            Map<String,Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("objectType");
            switch (discriminatorValue) {
                case "ARRAY":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesResultObjectNonflattenedArray.class);
                    newTimeSeriesResultObjectNonflattened.setActualInstance(deserialized);
                    return newTimeSeriesResultObjectNonflattened;
                case "MATRIX":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesResultObjectNonflattenedMatrix.class);
                    newTimeSeriesResultObjectNonflattened.setActualInstance(deserialized);
                    return newTimeSeriesResultObjectNonflattened;
                case "SCALAR":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesResultObjectNonflattenedScalar.class);
                    newTimeSeriesResultObjectNonflattened.setActualInstance(deserialized);
                    return newTimeSeriesResultObjectNonflattened;
                case "TIMESERIES":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesResultObjectNonflattenedTimeseriesObject.class);
                    newTimeSeriesResultObjectNonflattened.setActualInstance(deserialized);
                    return newTimeSeriesResultObjectNonflattened;
                case "time_series_result_object_nonflattened_array":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesResultObjectNonflattenedArray.class);
                    newTimeSeriesResultObjectNonflattened.setActualInstance(deserialized);
                    return newTimeSeriesResultObjectNonflattened;
                case "time_series_result_object_nonflattened_matrix":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesResultObjectNonflattenedMatrix.class);
                    newTimeSeriesResultObjectNonflattened.setActualInstance(deserialized);
                    return newTimeSeriesResultObjectNonflattened;
                case "time_series_result_object_nonflattened_scalar":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesResultObjectNonflattenedScalar.class);
                    newTimeSeriesResultObjectNonflattened.setActualInstance(deserialized);
                    return newTimeSeriesResultObjectNonflattened;
                case "time_series_result_object_nonflattened_timeseries_object":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesResultObjectNonflattenedTimeseriesObject.class);
                    newTimeSeriesResultObjectNonflattened.setActualInstance(deserialized);
                    return newTimeSeriesResultObjectNonflattened;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for TimeSeriesResultObjectNonflattened. Possible values: ARRAY MATRIX SCALAR TIMESERIES time_series_result_object_nonflattened_array time_series_result_object_nonflattened_matrix time_series_result_object_nonflattened_scalar time_series_result_object_nonflattened_timeseries_object", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize TimeSeriesResultObjectNonflattenedScalar
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TimeSeriesResultObjectNonflattenedScalar.class.equals(Integer.class) || TimeSeriesResultObjectNonflattenedScalar.class.equals(Long.class) || TimeSeriesResultObjectNonflattenedScalar.class.equals(Float.class) || TimeSeriesResultObjectNonflattenedScalar.class.equals(Double.class) || TimeSeriesResultObjectNonflattenedScalar.class.equals(Boolean.class) || TimeSeriesResultObjectNonflattenedScalar.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TimeSeriesResultObjectNonflattenedScalar.class.equals(Integer.class) || TimeSeriesResultObjectNonflattenedScalar.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TimeSeriesResultObjectNonflattenedScalar.class.equals(Float.class) || TimeSeriesResultObjectNonflattenedScalar.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TimeSeriesResultObjectNonflattenedScalar.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TimeSeriesResultObjectNonflattenedScalar.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<TimeSeriesResultObjectNonflattenedScalar>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TimeSeriesResultObjectNonflattenedScalar'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TimeSeriesResultObjectNonflattenedScalar'", e);
            }

            // deserialize TimeSeriesResultObjectNonflattenedArray
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TimeSeriesResultObjectNonflattenedArray.class.equals(Integer.class) || TimeSeriesResultObjectNonflattenedArray.class.equals(Long.class) || TimeSeriesResultObjectNonflattenedArray.class.equals(Float.class) || TimeSeriesResultObjectNonflattenedArray.class.equals(Double.class) || TimeSeriesResultObjectNonflattenedArray.class.equals(Boolean.class) || TimeSeriesResultObjectNonflattenedArray.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TimeSeriesResultObjectNonflattenedArray.class.equals(Integer.class) || TimeSeriesResultObjectNonflattenedArray.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TimeSeriesResultObjectNonflattenedArray.class.equals(Float.class) || TimeSeriesResultObjectNonflattenedArray.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TimeSeriesResultObjectNonflattenedArray.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TimeSeriesResultObjectNonflattenedArray.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<TimeSeriesResultObjectNonflattenedArray>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TimeSeriesResultObjectNonflattenedArray'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TimeSeriesResultObjectNonflattenedArray'", e);
            }

            // deserialize TimeSeriesResultObjectNonflattenedMatrix
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TimeSeriesResultObjectNonflattenedMatrix.class.equals(Integer.class) || TimeSeriesResultObjectNonflattenedMatrix.class.equals(Long.class) || TimeSeriesResultObjectNonflattenedMatrix.class.equals(Float.class) || TimeSeriesResultObjectNonflattenedMatrix.class.equals(Double.class) || TimeSeriesResultObjectNonflattenedMatrix.class.equals(Boolean.class) || TimeSeriesResultObjectNonflattenedMatrix.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TimeSeriesResultObjectNonflattenedMatrix.class.equals(Integer.class) || TimeSeriesResultObjectNonflattenedMatrix.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TimeSeriesResultObjectNonflattenedMatrix.class.equals(Float.class) || TimeSeriesResultObjectNonflattenedMatrix.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TimeSeriesResultObjectNonflattenedMatrix.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TimeSeriesResultObjectNonflattenedMatrix.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<TimeSeriesResultObjectNonflattenedMatrix>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TimeSeriesResultObjectNonflattenedMatrix'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TimeSeriesResultObjectNonflattenedMatrix'", e);
            }

            // deserialize TimeSeriesResultObjectNonflattenedTimeseriesObject
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(Integer.class) || TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(Long.class) || TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(Float.class) || TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(Double.class) || TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(Boolean.class) || TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(Integer.class) || TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(Float.class) || TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (TimeSeriesResultObjectNonflattenedTimeseriesObject.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<TimeSeriesResultObjectNonflattenedTimeseriesObject>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'TimeSeriesResultObjectNonflattenedTimeseriesObject'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'TimeSeriesResultObjectNonflattenedTimeseriesObject'", e);
            }

            if (match == 1) {
                TimeSeriesResultObjectNonflattened ret = new TimeSeriesResultObjectNonflattened();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for TimeSeriesResultObjectNonflattened: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public TimeSeriesResultObjectNonflattened getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "TimeSeriesResultObjectNonflattened cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public TimeSeriesResultObjectNonflattened() {
        super("oneOf", Boolean.FALSE);
    }

    public TimeSeriesResultObjectNonflattened(TimeSeriesResultObjectNonflattenedScalar o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public TimeSeriesResultObjectNonflattened(TimeSeriesResultObjectNonflattenedArray o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public TimeSeriesResultObjectNonflattened(TimeSeriesResultObjectNonflattenedMatrix o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public TimeSeriesResultObjectNonflattened(TimeSeriesResultObjectNonflattenedTimeseriesObject o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    static {
        schemas.put("TimeSeriesResultObjectNonflattenedArray", new GenericType<TimeSeriesResultObjectNonflattenedArray>() {
        });
        schemas.put("TimeSeriesResultObjectNonflattenedMatrix", new GenericType<TimeSeriesResultObjectNonflattenedMatrix>() {
        });
        schemas.put("TimeSeriesResultObjectNonflattenedScalar", new GenericType<TimeSeriesResultObjectNonflattenedScalar>() {
        });
        schemas.put("TimeSeriesResultObjectNonflattenedTimeseriesObject", new GenericType<TimeSeriesResultObjectNonflattenedTimeseriesObject>() {
        });
        JSON.registerDescendants(TimeSeriesResultObjectNonflattened.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("ARRAY", TimeSeriesResultObjectNonflattenedArray.class);
        mappings.put("MATRIX", TimeSeriesResultObjectNonflattenedMatrix.class);
        mappings.put("SCALAR", TimeSeriesResultObjectNonflattenedScalar.class);
        mappings.put("TIMESERIES", TimeSeriesResultObjectNonflattenedTimeseriesObject.class);
        mappings.put("time_series_result_object_nonflattened_array", TimeSeriesResultObjectNonflattenedArray.class);
        mappings.put("time_series_result_object_nonflattened_matrix", TimeSeriesResultObjectNonflattenedMatrix.class);
        mappings.put("time_series_result_object_nonflattened_scalar", TimeSeriesResultObjectNonflattenedScalar.class);
        mappings.put("time_series_result_object_nonflattened_timeseries_object", TimeSeriesResultObjectNonflattenedTimeseriesObject.class);
        mappings.put("time_series_result_object_nonflattened", TimeSeriesResultObjectNonflattened.class);
        JSON.registerDiscriminator(TimeSeriesResultObjectNonflattened.class, "objectType", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return TimeSeriesResultObjectNonflattened.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TimeSeriesResultObjectNonflattenedArray, TimeSeriesResultObjectNonflattenedMatrix, TimeSeriesResultObjectNonflattenedScalar, TimeSeriesResultObjectNonflattenedTimeseriesObject
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        // TimeSeriesResultObjectNonflattenedScalar
        if (JSON.isInstanceOf(TimeSeriesResultObjectNonflattenedScalar.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // TimeSeriesResultObjectNonflattenedArray
        if (JSON.isInstanceOf(TimeSeriesResultObjectNonflattenedArray.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // TimeSeriesResultObjectNonflattenedMatrix
        if (JSON.isInstanceOf(TimeSeriesResultObjectNonflattenedMatrix.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // TimeSeriesResultObjectNonflattenedTimeseriesObject
        if (JSON.isInstanceOf(TimeSeriesResultObjectNonflattenedTimeseriesObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TimeSeriesResultObjectNonflattenedArray, TimeSeriesResultObjectNonflattenedMatrix, TimeSeriesResultObjectNonflattenedScalar, TimeSeriesResultObjectNonflattenedTimeseriesObject");
    }

    /**
     * Get the actual instance, which can be the following:
     * TimeSeriesResultObjectNonflattenedArray, TimeSeriesResultObjectNonflattenedMatrix, TimeSeriesResultObjectNonflattenedScalar, TimeSeriesResultObjectNonflattenedTimeseriesObject
     *
     * @return The actual instance (TimeSeriesResultObjectNonflattenedArray, TimeSeriesResultObjectNonflattenedMatrix, TimeSeriesResultObjectNonflattenedScalar, TimeSeriesResultObjectNonflattenedTimeseriesObject)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeSeriesResultObjectNonflattenedScalar`. If the actual instance is not `TimeSeriesResultObjectNonflattenedScalar`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeSeriesResultObjectNonflattenedScalar`
     * @throws ClassCastException if the instance is not `TimeSeriesResultObjectNonflattenedScalar`
     */
    public TimeSeriesResultObjectNonflattenedScalar getTimeSeriesResultObjectNonflattenedScalar() throws ClassCastException {
        return (TimeSeriesResultObjectNonflattenedScalar)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeSeriesResultObjectNonflattenedArray`. If the actual instance is not `TimeSeriesResultObjectNonflattenedArray`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeSeriesResultObjectNonflattenedArray`
     * @throws ClassCastException if the instance is not `TimeSeriesResultObjectNonflattenedArray`
     */
    public TimeSeriesResultObjectNonflattenedArray getTimeSeriesResultObjectNonflattenedArray() throws ClassCastException {
        return (TimeSeriesResultObjectNonflattenedArray)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeSeriesResultObjectNonflattenedMatrix`. If the actual instance is not `TimeSeriesResultObjectNonflattenedMatrix`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeSeriesResultObjectNonflattenedMatrix`
     * @throws ClassCastException if the instance is not `TimeSeriesResultObjectNonflattenedMatrix`
     */
    public TimeSeriesResultObjectNonflattenedMatrix getTimeSeriesResultObjectNonflattenedMatrix() throws ClassCastException {
        return (TimeSeriesResultObjectNonflattenedMatrix)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeSeriesResultObjectNonflattenedTimeseriesObject`. If the actual instance is not `TimeSeriesResultObjectNonflattenedTimeseriesObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeSeriesResultObjectNonflattenedTimeseriesObject`
     * @throws ClassCastException if the instance is not `TimeSeriesResultObjectNonflattenedTimeseriesObject`
     */
    public TimeSeriesResultObjectNonflattenedTimeseriesObject getTimeSeriesResultObjectNonflattenedTimeseriesObject() throws ClassCastException {
        return (TimeSeriesResultObjectNonflattenedTimeseriesObject)super.getActualInstance();
    }

}

