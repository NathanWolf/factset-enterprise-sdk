/*
 * FactSet Exchange Traded Funds API
 *
 * FactSet ETF data feeds provide complete and accurate security, fund and reference data across the universe of exchange-traded products. Data is sourced from ETF providers across the globe and includes more than 100 unique data points, resulting in comprehensive coverage to help you evaluate and construct ETFs, analyze potential trades, and perform fund research.<p> FactSet Reference and Analytics data uses FactSet's FCS, which categorizes exchange-traded products using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund's prospectus and marketing materials. ETF exposure details are presented on successively granular levels-  category, then focus, and then niche.</p> <p>Moreover, FactSet ETF Reference data captures over 100 unique data points and provides market-specific data if you wish to solely focus on U.S., Canadian, Australian, New Zealand, Singapore, Hong Kong or European exchanges. All data points are grouped in one of two levels, either as a Fund or as a Listing. However, FactSet ETF Analytics data is primarily available for U.S.-domiciled ETFs. A subset of reference data items are provided for European-domiciled funds. For a full breakout of regional availability and history, see Formula Definitions and Calculations.</p> 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using Newtonsoft.Json;
using Newtonsoft.Json.Serialization;

namespace FactSet.SDK.FactSetETF.Model
{
    /// <summary>
    ///  Abstract base class for oneOf, anyOf schemas in the OpenAPI specification
    /// </summary>
    public abstract partial class AbstractOpenAPISchema
    {
        /// <summary>
        ///  Custom JSON serializer
        /// </summary>
        static public readonly JsonSerializerSettings SerializerSettings = new JsonSerializerSettings
        {
            // OpenAPI generated types generally hide default constructors.
            ConstructorHandling = ConstructorHandling.AllowNonPublicDefaultConstructor,
            MissingMemberHandling = MissingMemberHandling.Error,
            ContractResolver = new DefaultContractResolver
            {
                NamingStrategy = new CamelCaseNamingStrategy
                {
                    OverrideSpecifiedNames = false
                }
            }
        };

        /// <summary>
        ///  Custom JSON serializer for objects with additional properties
        /// </summary>
        static public readonly JsonSerializerSettings AdditionalPropertiesSerializerSettings = new JsonSerializerSettings
        {
            // OpenAPI generated types generally hide default constructors.
            ConstructorHandling = ConstructorHandling.AllowNonPublicDefaultConstructor,
            MissingMemberHandling = MissingMemberHandling.Ignore,
            ContractResolver = new DefaultContractResolver
            {
                NamingStrategy = new CamelCaseNamingStrategy
                {
                    OverrideSpecifiedNames = false
                }
            }
        };

        /// <summary>
        /// Gets or Sets the actual instance
        /// </summary>
        public abstract Object ActualInstance { get; set; }

        /// <summary>
        /// Gets or Sets IsNullable to indicate whether the instance is nullable
        /// </summary>
        public bool IsNullable { get; protected set; }

        /// <summary>
        /// Gets or Sets the schema type, which can be either `oneOf` or `anyOf`
        /// </summary>
        public string SchemaType { get; protected set; }

        /// <summary>
        /// Converts the instance into JSON string.
        /// </summary>
        public abstract string ToJson();
    }
}
