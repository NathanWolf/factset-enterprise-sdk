/**
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and Bloomberg FIGIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as of a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time.</p> 
 *
 * The version of the OpenAPI document: 2.1.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FactsetTranslation model module.
 * @module model/FactsetTranslation
 * @version 0.20.0
 */
class FactsetTranslation {
    /**
     * Constructs a new <code>FactsetTranslation</code>.
     * FactSet Translation data object.
     * @alias module:model/FactsetTranslation
     */
    constructor() { 
        
        FactsetTranslation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FactsetTranslation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FactsetTranslation} obj Optional instance to populate.
     * @return {module:model/FactsetTranslation} The populated <code>FactsetTranslation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FactsetTranslation();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('fsymSecurityId')) {
                obj['fsymSecurityId'] = ApiClient.convertToType(data['fsymSecurityId'], 'String');
            }
            if (data.hasOwnProperty('fsymRegionalId')) {
                obj['fsymRegionalId'] = ApiClient.convertToType(data['fsymRegionalId'], 'String');
            }
            if (data.hasOwnProperty('fsymListingId')) {
                obj['fsymListingId'] = ApiClient.convertToType(data['fsymListingId'], 'String');
            }
            if (data.hasOwnProperty('fsymEntityId')) {
                obj['fsymEntityId'] = ApiClient.convertToType(data['fsymEntityId'], 'String');
            }
            if (data.hasOwnProperty('fsymTickerExchange')) {
                obj['fsymTickerExchange'] = ApiClient.convertToType(data['fsymTickerExchange'], 'String');
            }
            if (data.hasOwnProperty('fsymTickerRegion')) {
                obj['fsymTickerRegion'] = ApiClient.convertToType(data['fsymTickerRegion'], 'String');
            }
            if (data.hasOwnProperty('frefListingExchange')) {
                obj['frefListingExchange'] = ApiClient.convertToType(data['frefListingExchange'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('securityType')) {
                obj['securityType'] = ApiClient.convertToType(data['securityType'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Default Permanent Identifier. Regional and Composite (-USA) request `ids` will use a Regional ID '-R', Listing specific ids '-NYS' will use Listing ids '-L', Entities will use '-E', and FI will use security '-S' ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
 * @member {String} fsymId
 */
FactsetTranslation.prototype['fsymId'] = undefined;

/**
 * FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
 * @member {String} fsymSecurityId
 */
FactsetTranslation.prototype['fsymSecurityId'] = undefined;

/**
 * FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
 * @member {String} fsymRegionalId
 */
FactsetTranslation.prototype['fsymRegionalId'] = undefined;

/**
 * FactSet Listing Security Identifier. Six alpha-numeric characters, vowels excluded, with an -L suffix (XXXXXX-L). The listing-level permanent identifier will be available prior to the end of trading on the first day of trading. Does not populate for composite ids (i.e. '-USA') since these are not specified listing exchanges. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
 * @member {String} fsymListingId
 */
FactsetTranslation.prototype['fsymListingId'] = undefined;

/**
 * FactSet Entity Identifier (-E). For more information on Entity Ids, visit [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
 * @member {String} fsymEntityId
 */
FactsetTranslation.prototype['fsymEntityId'] = undefined;

/**
 * FactSet exchange ticker symbol. For definitions of Exchange Codes, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544).
 * @member {String} fsymTickerExchange
 */
FactsetTranslation.prototype['fsymTickerExchange'] = undefined;

/**
 * FactSet region ticker symbol. For details on Global Region Codes, visit [Online Assistant Page #13258](https://oa.apps.factset.com/pages/13258)
 * @member {String} fsymTickerRegion
 */
FactsetTranslation.prototype['fsymTickerRegion'] = undefined;

/**
 * Primary Listing Exchange Code. For details on Exchange Code Definitions, visit [Online Assistant Page #12544](https://oa.apps.factset.com/pages/12544) 
 * @member {String} frefListingExchange
 */
FactsetTranslation.prototype['frefListingExchange'] = undefined;

/**
 * Three character ISO Currency code. For details on ISO Currency Code definitions, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)
 * @member {String} currency
 */
FactsetTranslation.prototype['currency'] = undefined;

/**
 * The generic securityType for Equities and Fixed Income. Reach out to FactSet if more detailed security types or terms & conditions are needed. The available codes returned are as follows -  |securityType|Description| |---|---| |ABS|Asset Backed Security | |ADR|American Depositary Receipt- An ADR is issued by a U.S. depositary bank and represents shares of a foreign corporation held by the bank. ADRs provide foreign companies with an access to U.S. capital markets. The instruments typically trade in U.S. dollars.| |ALIEN|Alien/Foreign- Shares that foreign investors can purchase from countries where they issue shares, such as Thailand. Foreigners can register these shares under their own name using the Foreign Board and receive all benefits offered by the company, such as rights offerings and dividends. Such securities have no floor or ceiling limits, so share prices respond to the demand and supply.| |BDNT|Bond/Note| |BLDN|Bill/Discount Note | |CONV|Convertible/Exchangeable| |COVR|Covered Bond | |DR|Depositary Receipts/Certificates- This security type represents all other depository receipts not mentioned above. Depositary Receipts (DR) are negotiable certificates that enable domestic investors to own shares in foreign companies. Each DR represents a given number of a company's shares.| |ETF_ETF|Exchange Traded Fund (ETF_ETF)- A security that is created to track the performance of an index or a basket of assets. ETFs are traded on organized exchanges.| |ETF_NAV|Exchange Traded Fund (ETF_NAV)- The Net Asset Value (NAV) is calculated by taking the total assets of the ETF, less liabilities, divided by the number of ETF shares outstanding.| |ETF_UVI|Exchange Traded Fund (ETF_UVI)- The Intraday Indicative Value is designed to give investors a sense of the relationship between a basket of securities that are representative of those owned in the ETF and the share price of the ETF on an intraday basis. An Intraday Indicative Value is published as a reference value to be used in conjunction with other ETF market information.| |GDR|Global Depositary Receipt- Certificate that represents ownership of a given number of a company's shares and can be listed and traded independently from the underlying shares. Provide issuers with an access to foreign capital markets.| |LKS|Linked Securities| |MF_C|Closed-ended Fund- These funds have a fixed number of shares, which are listed on the stock exchange. The market price of the shares is determined by demand and supply factors. These are readily transferable in the open market and are bought and sold like other stock. These funds do not accept new contributions from investors, but only reinvest the return on the existing portfolio.| |MF_O|Open-ended Fund- These funds have no limit to the number of units (or shares) they can issue. The price of the units (or shares) remains closely aligned to the NAV of the fund. Open-end funds sell their own new shares to investors, stand ready to buy back their old shares, and are not listed on exchanges. Open-end funds are so called because their capitalization is not fixed.| |MM|Bill/Discount Note | |MM|Money Market| |NVDR|Non-Voting Depositary Receipt- A Non-Voting Depository Receipt (NVDR) is a trading instrument issued by the Thai NVDR Company Limited, a subsidiary wholly owned by the Stock Exchange of Thailand (SET). Investment in NVDR eliminates foreign investment barriers. The only difference between investing in NVDRs and the company's shares is the voting right. NVDRs are automatically regarded as listed securities in the SET.| |PASS|Pass-Through | |PFD|Preferred | |PREF|Preferred- A type of stock that pays a fixed dividend regardless of corporate earnings, and which has priority over common stock in the payment of dividends. The main characteristics of preferred stocks is the fixed income stream and priority of payment at liquidation.| |PREFEQ|Preferred Equity- A security that has equity characteristics (i.e., ownership at liquidation, share in the profits in the company) rather than fixed redemption and trades as a common equity (i.e., is very liquid and its prices are quoted in a currency rather than percentage of par, which is a common characteristic of preferred stock). These securities are most commonly issued in Brazil, Canada, and many European markets (i.e., Russia, Germany, and Italy). Preferred equity has some priority rights over common stock. This category also includes Italian savings shares.| |RIGHT|Right- A right gives the holder an option to purchase additional shares of an underlying instrument at a pre-determined price on a specified date (typically at a discount from the market price). In most cases, right instruments must be exercised within a relatively short period.| |SHARE|Share/Common/Ordinary- Securities that represent an ownership interest in a corporation. If the company has also issued preferred stock, both common and preferred stockholders have ownership rights. Common stockholders assume the greater risk, but generally exercise greater control and may gain a larger award in the form of dividends and capital appreciation.| |STRUCT|Structured Products- Investment products that are based on an underlying security such as a single equity, a basket of stocks, an index, a commodity, a debt issuance, or a foreign currency.| |TEMP|Temporary- Securities that trade for a limited period of time (typically less than a year) and trade alongside the mainline security. Also included are securities that trade alongside the mainline and then assimilate to the mainline security after trading for few days/months. Examples of temporary instruments are parallel lines and assented lines.| |UNIT|Unit- An equity that consists of more than one equity instrument (i.e., security consisting of class A and B; 1 share and 1 warrant).| |WARRANT|Warrant- An instrument giving the holder a right to subscribe to an underlying instrument at a given price and date.| 
 * @member {String} securityType
 */
FactsetTranslation.prototype['securityType'] = undefined;

/**
 * Proper Name of company or issuer.
 * @member {String} name
 */
FactsetTranslation.prototype['name'] = undefined;

/**
 * Identifier specified in the `ids` parameter of the request.
 * @member {String} requestId
 */
FactsetTranslation.prototype['requestId'] = undefined;






export default FactsetTranslation;

