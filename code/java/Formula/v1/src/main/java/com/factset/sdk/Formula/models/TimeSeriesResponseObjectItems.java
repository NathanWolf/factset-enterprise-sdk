/*
 * FactSet Formula API
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  Please use the below endpoint to download the FactSet Formula API Specification File in .yaml. You must be authorized for this API to extract. This specification can then be used for Codegen to create your own SDKs. You can also download the spec using the \"Download Spec\" button to the right of the version number.  [https://api.factset.com/formula-api/v1/spec](https://api.factset.com/formula-api/v1/spec) 
 *
 * The version of the OpenAPI document: 1.2.0
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
import com.factset.sdk.Formula.models.TimeSeriesResultObjectFlattened;
import com.factset.sdk.Formula.models.TimeSeriesResultObjectNonflattened;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Formula.JSON;


import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.factset.sdk.Formula.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using=TimeSeriesResponseObjectItems.TimeSeriesResponseObjectItemsDeserializer.class)
@JsonSerialize(using = TimeSeriesResponseObjectItems.TimeSeriesResponseObjectItemsSerializer.class)
public class TimeSeriesResponseObjectItems extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(TimeSeriesResponseObjectItems.class.getName());

    public static class TimeSeriesResponseObjectItemsSerializer extends StdSerializer<TimeSeriesResponseObjectItems> {
        public TimeSeriesResponseObjectItemsSerializer(Class<TimeSeriesResponseObjectItems> t) {
            super(t);
        }

        public TimeSeriesResponseObjectItemsSerializer() {
            this(null);
        }

        @Override
        public void serialize(TimeSeriesResponseObjectItems value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class TimeSeriesResponseObjectItemsDeserializer extends StdDeserializer<TimeSeriesResponseObjectItems> {
        public TimeSeriesResponseObjectItemsDeserializer() {
            this(TimeSeriesResponseObjectItems.class);
        }

        public TimeSeriesResponseObjectItemsDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public TimeSeriesResponseObjectItems deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize TimeSeriesResultObjectFlattened
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesResultObjectFlattened.class);
                TimeSeriesResponseObjectItems ret = new TimeSeriesResponseObjectItems();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'TimeSeriesResponseObjectItems'", e);
            }

            // deserialize TimeSeriesResultObjectNonflattened
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(TimeSeriesResultObjectNonflattened.class);
                TimeSeriesResponseObjectItems ret = new TimeSeriesResponseObjectItems();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'TimeSeriesResponseObjectItems'", e);
            }

            throw new IOException(String.format("Failed deserialization for TimeSeriesResponseObjectItems: no match found"));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public TimeSeriesResponseObjectItems getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "TimeSeriesResponseObjectItems cannot be null");
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public TimeSeriesResponseObjectItems() {
        super("anyOf", Boolean.FALSE);
    }

    public TimeSeriesResponseObjectItems(TimeSeriesResultObjectFlattened o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TimeSeriesResponseObjectItems(TimeSeriesResultObjectNonflattened o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TimeSeriesResultObjectFlattened", new GenericType<TimeSeriesResultObjectFlattened>() {
        });
        schemas.put("TimeSeriesResultObjectNonflattened", new GenericType<TimeSeriesResultObjectNonflattened>() {
        });
        JSON.registerDescendants(TimeSeriesResponseObjectItems.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return TimeSeriesResponseObjectItems.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * TimeSeriesResultObjectFlattened, TimeSeriesResultObjectNonflattened
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(TimeSeriesResultObjectFlattened.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(TimeSeriesResultObjectNonflattened.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TimeSeriesResultObjectFlattened, TimeSeriesResultObjectNonflattened");
    }

    /**
     * Get the actual instance, which can be the following:
     * TimeSeriesResultObjectFlattened, TimeSeriesResultObjectNonflattened
     *
     * @return The actual instance (TimeSeriesResultObjectFlattened, TimeSeriesResultObjectNonflattened)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeSeriesResultObjectFlattened`. If the actual instance is not `TimeSeriesResultObjectFlattened`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeSeriesResultObjectFlattened`
     * @throws ClassCastException if the instance is not `TimeSeriesResultObjectFlattened`
     */
    public TimeSeriesResultObjectFlattened getTimeSeriesResultObjectFlattened() throws ClassCastException {
        return (TimeSeriesResultObjectFlattened)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TimeSeriesResultObjectNonflattened`. If the actual instance is not `TimeSeriesResultObjectNonflattened`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TimeSeriesResultObjectNonflattened`
     * @throws ClassCastException if the instance is not `TimeSeriesResultObjectNonflattened`
     */
    public TimeSeriesResultObjectNonflattened getTimeSeriesResultObjectNonflattened() throws ClassCastException {
        return (TimeSeriesResultObjectNonflattened)super.getActualInstance();
    }

}

