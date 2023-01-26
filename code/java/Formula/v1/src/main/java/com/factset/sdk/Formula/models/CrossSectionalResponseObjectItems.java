/*
 * FactSet Formula API
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  Please use the below endpoint to download the FactSet Formula API Specification File in .yaml. You must be authorized for this API to extract. This specification can then be used for Codegen to create your own SDKs. You can also download the spec using the \"Download Spec\" button to the right of the version number.  [https://api.factset.com/formula-api/v1/spec](https://api.factset.com/formula-api/v1/spec) 
 *
 * The version of the OpenAPI document: 1.4
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
import com.factset.sdk.Formula.models.CrossSectionalResultObjectFlattened;
import com.factset.sdk.Formula.models.CrossSectionalResultObjectNonflattened;
import com.factset.sdk.Formula.models.CrossSectionalResultObjectNonflattenedResultAttribute;
import com.factset.sdk.Formula.models.CrossSectionalResultObjectNonflattenedWarnings;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = CrossSectionalResponseObjectItems.CrossSectionalResponseObjectItemsDeserializer.class)
@JsonSerialize(using = CrossSectionalResponseObjectItems.CrossSectionalResponseObjectItemsSerializer.class)
public class CrossSectionalResponseObjectItems extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(CrossSectionalResponseObjectItems.class.getName());

    public static class CrossSectionalResponseObjectItemsSerializer extends StdSerializer<CrossSectionalResponseObjectItems> {
        public CrossSectionalResponseObjectItemsSerializer(Class<CrossSectionalResponseObjectItems> t) {
            super(t);
        }

        public CrossSectionalResponseObjectItemsSerializer() {
            this(null);
        }

        @Override
        public void serialize(CrossSectionalResponseObjectItems value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class CrossSectionalResponseObjectItemsDeserializer extends StdDeserializer<CrossSectionalResponseObjectItems> {
        public CrossSectionalResponseObjectItemsDeserializer() {
            this(CrossSectionalResponseObjectItems.class);
        }

        public CrossSectionalResponseObjectItemsDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public CrossSectionalResponseObjectItems deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CrossSectionalResultObjectNonflattened
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CrossSectionalResultObjectNonflattened.class.equals(Integer.class) || CrossSectionalResultObjectNonflattened.class.equals(Long.class) || CrossSectionalResultObjectNonflattened.class.equals(Float.class) || CrossSectionalResultObjectNonflattened.class.equals(Double.class) || CrossSectionalResultObjectNonflattened.class.equals(Boolean.class) || CrossSectionalResultObjectNonflattened.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CrossSectionalResultObjectNonflattened.class.equals(Integer.class) || CrossSectionalResultObjectNonflattened.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CrossSectionalResultObjectNonflattened.class.equals(Float.class) || CrossSectionalResultObjectNonflattened.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CrossSectionalResultObjectNonflattened.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CrossSectionalResultObjectNonflattened.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<CrossSectionalResultObjectNonflattened>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CrossSectionalResultObjectNonflattened'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CrossSectionalResultObjectNonflattened'", e);
            }

            // deserialize CrossSectionalResultObjectFlattened
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CrossSectionalResultObjectFlattened.class.equals(Integer.class) || CrossSectionalResultObjectFlattened.class.equals(Long.class) || CrossSectionalResultObjectFlattened.class.equals(Float.class) || CrossSectionalResultObjectFlattened.class.equals(Double.class) || CrossSectionalResultObjectFlattened.class.equals(Boolean.class) || CrossSectionalResultObjectFlattened.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CrossSectionalResultObjectFlattened.class.equals(Integer.class) || CrossSectionalResultObjectFlattened.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CrossSectionalResultObjectFlattened.class.equals(Float.class) || CrossSectionalResultObjectFlattened.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CrossSectionalResultObjectFlattened.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CrossSectionalResultObjectFlattened.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<CrossSectionalResultObjectFlattened>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CrossSectionalResultObjectFlattened'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CrossSectionalResultObjectFlattened'", e);
            }

            if (match == 1) {
                CrossSectionalResponseObjectItems ret = new CrossSectionalResponseObjectItems();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for CrossSectionalResponseObjectItems: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public CrossSectionalResponseObjectItems getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "CrossSectionalResponseObjectItems cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CrossSectionalResponseObjectItems() {
        super("oneOf", Boolean.FALSE);
    }

    public CrossSectionalResponseObjectItems(CrossSectionalResultObjectNonflattened o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public CrossSectionalResponseObjectItems(CrossSectionalResultObjectFlattened o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    static {
        schemas.put("CrossSectionalResultObjectFlattened", new GenericType<CrossSectionalResultObjectFlattened>() {
        });
        schemas.put("CrossSectionalResultObjectNonflattened", new GenericType<CrossSectionalResultObjectNonflattened>() {
        });
        JSON.registerDescendants(CrossSectionalResponseObjectItems.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CrossSectionalResponseObjectItems.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CrossSectionalResultObjectFlattened, CrossSectionalResultObjectNonflattened
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        // CrossSectionalResultObjectNonflattened
        if (JSON.isInstanceOf(CrossSectionalResultObjectNonflattened.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // CrossSectionalResultObjectFlattened
        if (JSON.isInstanceOf(CrossSectionalResultObjectFlattened.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CrossSectionalResultObjectFlattened, CrossSectionalResultObjectNonflattened");
    }

    /**
     * Get the actual instance, which can be the following:
     * CrossSectionalResultObjectFlattened, CrossSectionalResultObjectNonflattened
     *
     * @return The actual instance (CrossSectionalResultObjectFlattened, CrossSectionalResultObjectNonflattened)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CrossSectionalResultObjectNonflattened`. If the actual instance is not `CrossSectionalResultObjectNonflattened`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CrossSectionalResultObjectNonflattened`
     * @throws ClassCastException if the instance is not `CrossSectionalResultObjectNonflattened`
     */
    public CrossSectionalResultObjectNonflattened getCrossSectionalResultObjectNonflattened() throws ClassCastException {
        return (CrossSectionalResultObjectNonflattened)super.getActualInstance();
    }
    
    /**
     * Get the actual instance of `CrossSectionalResultObjectFlattened`. If the actual instance is not `CrossSectionalResultObjectFlattened`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CrossSectionalResultObjectFlattened`
     * @throws ClassCastException if the instance is not `CrossSectionalResultObjectFlattened`
     */
    public CrossSectionalResultObjectFlattened getCrossSectionalResultObjectFlattened() throws ClassCastException {
        return (CrossSectionalResultObjectFlattened)super.getActualInstance();
    }
    
}

