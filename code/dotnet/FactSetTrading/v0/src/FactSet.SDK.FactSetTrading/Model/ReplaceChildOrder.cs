/*
 * EMS API
 *
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.FactSetTrading.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTrading.Model
{
    /// <summary>
    /// EMS Replace Child Orders
    /// </summary>
    [DataContract(Name = "ReplaceChildOrder")]
    public partial class ReplaceChildOrder : IEquatable<ReplaceChildOrder>, IValidatableObject
    {
        /// <summary>
        /// Type of the order
        /// </summary>
        /// <value>Type of the order</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OrderTypeEnum
        {
            /// <summary>
            /// Enum Market for value: market
            /// </summary>
            [EnumMember(Value = "market")]
            Market = 1,

            /// <summary>
            /// Enum Limit for value: limit
            /// </summary>
            [EnumMember(Value = "limit")]
            Limit = 2,

            /// <summary>
            /// Enum Stop for value: stop
            /// </summary>
            [EnumMember(Value = "stop")]
            Stop = 3,

            /// <summary>
            /// Enum StopLimit for value: stopLimit
            /// </summary>
            [EnumMember(Value = "stopLimit")]
            StopLimit = 4,

            /// <summary>
            /// Enum MarketOnClose for value: marketOnClose
            /// </summary>
            [EnumMember(Value = "marketOnClose")]
            MarketOnClose = 5,

            /// <summary>
            /// Enum LimitOrBetter for value: limitOrBetter
            /// </summary>
            [EnumMember(Value = "limitOrBetter")]
            LimitOrBetter = 6

        }


        /// <summary>
        /// Type of the order
        /// </summary>
        /// <value>Type of the order</value>
        [DataMember(Name = "orderType", EmitDefaultValue = true)]
        public OrderTypeEnum? OrderType { get; set; }
        /// <summary>
        /// Instructions for order handling on Broker trading floor.
        /// </summary>
        /// <value>Instructions for order handling on Broker trading floor.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum HandlingInstructionsEnum
        {
            /// <summary>
            /// Enum AutoOrderPrivate for value: autoOrderPrivate
            /// </summary>
            [EnumMember(Value = "autoOrderPrivate")]
            AutoOrderPrivate = 1,

            /// <summary>
            /// Enum AutoOrderPublic for value: autoOrderPublic
            /// </summary>
            [EnumMember(Value = "autoOrderPublic")]
            AutoOrderPublic = 2,

            /// <summary>
            /// Enum BestExecution for value: bestExecution
            /// </summary>
            [EnumMember(Value = "bestExecution")]
            BestExecution = 3

        }


        /// <summary>
        /// Instructions for order handling on Broker trading floor.
        /// </summary>
        /// <value>Instructions for order handling on Broker trading floor.</value>
        [DataMember(Name = "handlingInstructions", EmitDefaultValue = true)]
        public HandlingInstructionsEnum? HandlingInstructions { get; set; }
        /// <summary>
        /// Order settlement period
        /// </summary>
        /// <value>Order settlement period</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SettlementTypeEnum
        {
            /// <summary>
            /// Enum Regular for value: regular
            /// </summary>
            [EnumMember(Value = "regular")]
            Regular = 1,

            /// <summary>
            /// Enum Cash for value: cash
            /// </summary>
            [EnumMember(Value = "cash")]
            Cash = 2,

            /// <summary>
            /// Enum NextDay for value: nextDay
            /// </summary>
            [EnumMember(Value = "nextDay")]
            NextDay = 3,

            /// <summary>
            /// Enum TPlus2 for value: tPlus2
            /// </summary>
            [EnumMember(Value = "tPlus2")]
            TPlus2 = 4,

            /// <summary>
            /// Enum TPlus3 for value: tPlus3
            /// </summary>
            [EnumMember(Value = "tPlus3")]
            TPlus3 = 5,

            /// <summary>
            /// Enum TPlus4 for value: tPlus4
            /// </summary>
            [EnumMember(Value = "tPlus4")]
            TPlus4 = 6,

            /// <summary>
            /// Enum Future for value: future
            /// </summary>
            [EnumMember(Value = "future")]
            Future = 7,

            /// <summary>
            /// Enum WhenIssued for value: whenIssued
            /// </summary>
            [EnumMember(Value = "whenIssued")]
            WhenIssued = 8,

            /// <summary>
            /// Enum SellersOption for value: sellersOption
            /// </summary>
            [EnumMember(Value = "sellersOption")]
            SellersOption = 9,

            /// <summary>
            /// Enum TPlus5 for value: tPlus5
            /// </summary>
            [EnumMember(Value = "tPlus5")]
            TPlus5 = 10

        }


        /// <summary>
        /// Order settlement period
        /// </summary>
        /// <value>Order settlement period</value>
        [DataMember(Name = "settlementType", EmitDefaultValue = true)]
        public SettlementTypeEnum? SettlementType { get; set; }
        /// <summary>
        /// Instructions for order handling on exchange trading floor.
        /// </summary>
        /// <value>Instructions for order handling on exchange trading floor.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ExecutionInstructionsEnum
        {
            /// <summary>
            /// Enum NotHeld for value: notHeld
            /// </summary>
            [EnumMember(Value = "notHeld")]
            NotHeld = 1,

            /// <summary>
            /// Enum Work for value: work
            /// </summary>
            [EnumMember(Value = "work")]
            Work = 2,

            /// <summary>
            /// Enum GoAlong for value: goAlong
            /// </summary>
            [EnumMember(Value = "goAlong")]
            GoAlong = 3,

            /// <summary>
            /// Enum OverTheDay for value: overTheDay
            /// </summary>
            [EnumMember(Value = "overTheDay")]
            OverTheDay = 4,

            /// <summary>
            /// Enum Held for value: held
            /// </summary>
            [EnumMember(Value = "held")]
            Held = 5,

            /// <summary>
            /// Enum ParticipateDoNotInitiate for value: participateDoNotInitiate
            /// </summary>
            [EnumMember(Value = "participateDoNotInitiate")]
            ParticipateDoNotInitiate = 6,

            /// <summary>
            /// Enum StrictScale for value: strictScale
            /// </summary>
            [EnumMember(Value = "strictScale")]
            StrictScale = 7,

            /// <summary>
            /// Enum TryToScale for value: tryToScale
            /// </summary>
            [EnumMember(Value = "tryToScale")]
            TryToScale = 8,

            /// <summary>
            /// Enum StayOnBidSide for value: stayOnBidSide
            /// </summary>
            [EnumMember(Value = "stayOnBidSide")]
            StayOnBidSide = 9,

            /// <summary>
            /// Enum StayOnOfferSide for value: stayOnOfferSide
            /// </summary>
            [EnumMember(Value = "stayOnOfferSide")]
            StayOnOfferSide = 10,

            /// <summary>
            /// Enum NoCross for value: noCross
            /// </summary>
            [EnumMember(Value = "noCross")]
            NoCross = 11,

            /// <summary>
            /// Enum OkToCross for value: okToCross
            /// </summary>
            [EnumMember(Value = "okToCross")]
            OkToCross = 12,

            /// <summary>
            /// Enum CallFirst for value: callFirst
            /// </summary>
            [EnumMember(Value = "callFirst")]
            CallFirst = 13,

            /// <summary>
            /// Enum PercentOfVolume for value: percentOfVolume
            /// </summary>
            [EnumMember(Value = "percentOfVolume")]
            PercentOfVolume = 14,

            /// <summary>
            /// Enum DoNotIncrease for value: doNotIncrease
            /// </summary>
            [EnumMember(Value = "doNotIncrease")]
            DoNotIncrease = 15,

            /// <summary>
            /// Enum DoNotReduce for value: doNotReduce
            /// </summary>
            [EnumMember(Value = "doNotReduce")]
            DoNotReduce = 16,

            /// <summary>
            /// Enum AllOrNone for value: allOrNone
            /// </summary>
            [EnumMember(Value = "allOrNone")]
            AllOrNone = 17,

            /// <summary>
            /// Enum ReinstateOnSystemFailure for value: reinstateOnSystemFailure
            /// </summary>
            [EnumMember(Value = "reinstateOnSystemFailure")]
            ReinstateOnSystemFailure = 18,

            /// <summary>
            /// Enum InstitutionsOnly for value: institutionsOnly
            /// </summary>
            [EnumMember(Value = "institutionsOnly")]
            InstitutionsOnly = 19,

            /// <summary>
            /// Enum ReinstateOnTradingHalt for value: reinstateOnTradingHalt
            /// </summary>
            [EnumMember(Value = "reinstateOnTradingHalt")]
            ReinstateOnTradingHalt = 20,

            /// <summary>
            /// Enum CancelOnTradingHalt for value: cancelOnTradingHalt
            /// </summary>
            [EnumMember(Value = "cancelOnTradingHalt")]
            CancelOnTradingHalt = 21,

            /// <summary>
            /// Enum LastPeg for value: lastPeg
            /// </summary>
            [EnumMember(Value = "lastPeg")]
            LastPeg = 22,

            /// <summary>
            /// Enum MidPricePeg for value: midPricePeg
            /// </summary>
            [EnumMember(Value = "midPricePeg")]
            MidPricePeg = 23,

            /// <summary>
            /// Enum NonNegotiable for value: nonNegotiable
            /// </summary>
            [EnumMember(Value = "nonNegotiable")]
            NonNegotiable = 24,

            /// <summary>
            /// Enum OpeningPeg for value: openingPeg
            /// </summary>
            [EnumMember(Value = "openingPeg")]
            OpeningPeg = 25,

            /// <summary>
            /// Enum MarketPeg for value: marketPeg
            /// </summary>
            [EnumMember(Value = "marketPeg")]
            MarketPeg = 26,

            /// <summary>
            /// Enum CancelOnSystemFailure for value: cancelOnSystemFailure
            /// </summary>
            [EnumMember(Value = "cancelOnSystemFailure")]
            CancelOnSystemFailure = 27,

            /// <summary>
            /// Enum PrimaryPeg for value: primaryPeg
            /// </summary>
            [EnumMember(Value = "primaryPeg")]
            PrimaryPeg = 28,

            /// <summary>
            /// Enum Suspend for value: suspend
            /// </summary>
            [EnumMember(Value = "suspend")]
            Suspend = 29,

            /// <summary>
            /// Enum FixedPegToLocalBestBid for value: fixedPegToLocalBestBid
            /// </summary>
            [EnumMember(Value = "fixedPegToLocalBestBid")]
            FixedPegToLocalBestBid = 30,

            /// <summary>
            /// Enum CustomerDisplayInstruction for value: customerDisplayInstruction
            /// </summary>
            [EnumMember(Value = "customerDisplayInstruction")]
            CustomerDisplayInstruction = 31,

            /// <summary>
            /// Enum Netting for value: netting
            /// </summary>
            [EnumMember(Value = "netting")]
            Netting = 32,

            /// <summary>
            /// Enum PegToVWAP for value: pegToVWAP
            /// </summary>
            [EnumMember(Value = "pegToVWAP")]
            PegToVWAP = 33,

            /// <summary>
            /// Enum TradeAlong for value: tradeAlong
            /// </summary>
            [EnumMember(Value = "tradeAlong")]
            TradeAlong = 34,

            /// <summary>
            /// Enum TryToStop for value: tryToStop
            /// </summary>
            [EnumMember(Value = "tryToStop")]
            TryToStop = 35,

            /// <summary>
            /// Enum CancelIfNotBest for value: cancelIfNotBest
            /// </summary>
            [EnumMember(Value = "cancelIfNotBest")]
            CancelIfNotBest = 36,

            /// <summary>
            /// Enum TrailingStopPeg for value: trailingStopPeg
            /// </summary>
            [EnumMember(Value = "trailingStopPeg")]
            TrailingStopPeg = 37,

            /// <summary>
            /// Enum StrictLimit for value: strictLimit
            /// </summary>
            [EnumMember(Value = "strictLimit")]
            StrictLimit = 38,

            /// <summary>
            /// Enum IgnorePriceValidityChecks for value: ignorePriceValidityChecks
            /// </summary>
            [EnumMember(Value = "ignorePriceValidityChecks")]
            IgnorePriceValidityChecks = 39,

            /// <summary>
            /// Enum PegToLimitPrice for value: pegToLimitPrice
            /// </summary>
            [EnumMember(Value = "pegToLimitPrice")]
            PegToLimitPrice = 40,

            /// <summary>
            /// Enum WorkToTargetStrategy for value: workToTargetStrategy
            /// </summary>
            [EnumMember(Value = "workToTargetStrategy")]
            WorkToTargetStrategy = 41,

            /// <summary>
            /// Enum IntermarketSweep for value: intermarketSweep
            /// </summary>
            [EnumMember(Value = "intermarketSweep")]
            IntermarketSweep = 42,

            /// <summary>
            /// Enum ExternalRoutingAllowed for value: externalRoutingAllowed
            /// </summary>
            [EnumMember(Value = "externalRoutingAllowed")]
            ExternalRoutingAllowed = 43,

            /// <summary>
            /// Enum ExternalRoutingNotAllowed for value: externalRoutingNotAllowed
            /// </summary>
            [EnumMember(Value = "externalRoutingNotAllowed")]
            ExternalRoutingNotAllowed = 44,

            /// <summary>
            /// Enum ImbalanceOnly for value: imbalanceOnly
            /// </summary>
            [EnumMember(Value = "imbalanceOnly")]
            ImbalanceOnly = 45,

            /// <summary>
            /// Enum SingleExecutionRequestedForBlockTrade for value: singleExecutionRequestedForBlockTrade
            /// </summary>
            [EnumMember(Value = "singleExecutionRequestedForBlockTrade")]
            SingleExecutionRequestedForBlockTrade = 46,

            /// <summary>
            /// Enum BestExecution for value: bestExecution
            /// </summary>
            [EnumMember(Value = "bestExecution")]
            BestExecution = 47

        }


        /// <summary>
        /// Instructions for order handling on exchange trading floor.
        /// </summary>
        /// <value>Instructions for order handling on exchange trading floor.</value>
        [DataMember(Name = "executionInstructions", EmitDefaultValue = true)]
        public ExecutionInstructionsEnum? ExecutionInstructions { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReplaceChildOrder" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ReplaceChildOrder() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReplaceChildOrder" /> class.
        /// </summary>
        /// <param name="ticketId">Ticket Id for the child order to be replaced (required).</param>
        /// <param name="orderType">Type of the order.</param>
        /// <param name="orderQuantity">Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order..</param>
        /// <param name="price">Order price per share..</param>
        /// <param name="timeInForce">timeInForce.</param>
        /// <param name="handlingInstructions">Instructions for order handling on Broker trading floor..</param>
        /// <param name="stopPrice">Stop-loss price to buy/sell stock at market..</param>
        /// <param name="maxFloor">Maximum number of shares within an order to be shown on the exchange floor at any given time..</param>
        /// <param name="minQuantity">Minimum quantity of an order to be executed..</param>
        /// <param name="settlementType">Order settlement period.</param>
        /// <param name="settlementDate">Specific date of trade settlement in YYYYMMDD format..</param>
        /// <param name="executionInstructions">Instructions for order handling on exchange trading floor..</param>
        /// <param name="locateRequired">Indicates whether the broker is to locate the stock in conjunction with a short sell order..</param>
        /// <param name="text">Free format text string..</param>
        /// <param name="userDefinedFields">User defined fields.</param>
        public ReplaceChildOrder(string ticketId,OrderTypeEnum? orderType = default(OrderTypeEnum?), double? orderQuantity = default(double?), double? price = default(double?), TimeInForce timeInForce = default(TimeInForce), HandlingInstructionsEnum? handlingInstructions = default(HandlingInstructionsEnum?), double? stopPrice = default(double?), double? maxFloor = default(double?), double? minQuantity = default(double?), SettlementTypeEnum? settlementType = default(SettlementTypeEnum?), string settlementDate = default(string), ExecutionInstructionsEnum? executionInstructions = default(ExecutionInstructionsEnum?), bool? locateRequired = default(bool?), string text = default(string), Dictionary<string, string> userDefinedFields = default(Dictionary<string, string>))
        {
            // to ensure "ticketId" is required (not null)
            if (ticketId == null) {
                throw new ArgumentNullException("ticketId is a required property for ReplaceChildOrder and cannot be null");
            }
            this.TicketId = ticketId;
            this.OrderType = orderType;
            this.OrderQuantity = orderQuantity;
            this.Price = price;
            this.TimeInForce = timeInForce;
            this.HandlingInstructions = handlingInstructions;
            this.StopPrice = stopPrice;
            this.MaxFloor = maxFloor;
            this.MinQuantity = minQuantity;
            this.SettlementType = settlementType;
            this.SettlementDate = settlementDate;
            this.ExecutionInstructions = executionInstructions;
            this.LocateRequired = locateRequired;
            this.Text = text;
            this.UserDefinedFields = userDefinedFields;
        }

        /// <summary>
        /// Ticket Id for the child order to be replaced
        /// </summary>
        /// <value>Ticket Id for the child order to be replaced</value>
        [DataMember(Name = "ticketId", IsRequired = true, EmitDefaultValue = false)]
        public string TicketId { get; set; }

        /// <summary>
        /// Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order.
        /// </summary>
        /// <value>Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order.</value>
        [DataMember(Name = "orderQuantity", EmitDefaultValue = true)]
        public double? OrderQuantity { get; set; }

        /// <summary>
        /// Order price per share.
        /// </summary>
        /// <value>Order price per share.</value>
        [DataMember(Name = "price", EmitDefaultValue = true)]
        public double? Price { get; set; }

        /// <summary>
        /// Gets or Sets TimeInForce
        /// </summary>
        [DataMember(Name = "timeInForce", EmitDefaultValue = false)]
        public TimeInForce TimeInForce { get; set; }

        /// <summary>
        /// Stop-loss price to buy/sell stock at market.
        /// </summary>
        /// <value>Stop-loss price to buy/sell stock at market.</value>
        [DataMember(Name = "stopPrice", EmitDefaultValue = true)]
        public double? StopPrice { get; set; }

        /// <summary>
        /// Maximum number of shares within an order to be shown on the exchange floor at any given time.
        /// </summary>
        /// <value>Maximum number of shares within an order to be shown on the exchange floor at any given time.</value>
        [DataMember(Name = "maxFloor", EmitDefaultValue = true)]
        public double? MaxFloor { get; set; }

        /// <summary>
        /// Minimum quantity of an order to be executed.
        /// </summary>
        /// <value>Minimum quantity of an order to be executed.</value>
        [DataMember(Name = "minQuantity", EmitDefaultValue = true)]
        public double? MinQuantity { get; set; }

        /// <summary>
        /// Specific date of trade settlement in YYYYMMDD format.
        /// </summary>
        /// <value>Specific date of trade settlement in YYYYMMDD format.</value>
        [DataMember(Name = "settlementDate", EmitDefaultValue = true)]
        public string SettlementDate { get; set; }

        /// <summary>
        /// Indicates whether the broker is to locate the stock in conjunction with a short sell order.
        /// </summary>
        /// <value>Indicates whether the broker is to locate the stock in conjunction with a short sell order.</value>
        [DataMember(Name = "locateRequired", EmitDefaultValue = true)]
        public bool? LocateRequired { get; set; }

        /// <summary>
        /// Free format text string.
        /// </summary>
        /// <value>Free format text string.</value>
        [DataMember(Name = "text", EmitDefaultValue = true)]
        public string Text { get; set; }

        /// <summary>
        /// User defined fields
        /// </summary>
        /// <value>User defined fields</value>
        [DataMember(Name = "userDefinedFields", EmitDefaultValue = true)]
        public Dictionary<string, string> UserDefinedFields { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReplaceChildOrder {\n");
            sb.Append("  TicketId: ").Append(TicketId).Append("\n");
            sb.Append("  OrderType: ").Append(OrderType).Append("\n");
            sb.Append("  OrderQuantity: ").Append(OrderQuantity).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  TimeInForce: ").Append(TimeInForce).Append("\n");
            sb.Append("  HandlingInstructions: ").Append(HandlingInstructions).Append("\n");
            sb.Append("  StopPrice: ").Append(StopPrice).Append("\n");
            sb.Append("  MaxFloor: ").Append(MaxFloor).Append("\n");
            sb.Append("  MinQuantity: ").Append(MinQuantity).Append("\n");
            sb.Append("  SettlementType: ").Append(SettlementType).Append("\n");
            sb.Append("  SettlementDate: ").Append(SettlementDate).Append("\n");
            sb.Append("  ExecutionInstructions: ").Append(ExecutionInstructions).Append("\n");
            sb.Append("  LocateRequired: ").Append(LocateRequired).Append("\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  UserDefinedFields: ").Append(UserDefinedFields).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ReplaceChildOrder);
        }

        /// <summary>
        /// Returns true if ReplaceChildOrder instances are equal
        /// </summary>
        /// <param name="input">Instance of ReplaceChildOrder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReplaceChildOrder input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TicketId == input.TicketId ||
                    (this.TicketId != null &&
                    this.TicketId.Equals(input.TicketId))
                ) && 
                (
                    this.OrderType == input.OrderType ||
                    this.OrderType.Equals(input.OrderType)
                ) && 
                (
                    this.OrderQuantity == input.OrderQuantity ||
                    (this.OrderQuantity != null &&
                    this.OrderQuantity.Equals(input.OrderQuantity))
                ) && 
                (
                    this.Price == input.Price ||
                    (this.Price != null &&
                    this.Price.Equals(input.Price))
                ) && 
                (
                    this.TimeInForce == input.TimeInForce ||
                    (this.TimeInForce != null &&
                    this.TimeInForce.Equals(input.TimeInForce))
                ) && 
                (
                    this.HandlingInstructions == input.HandlingInstructions ||
                    this.HandlingInstructions.Equals(input.HandlingInstructions)
                ) && 
                (
                    this.StopPrice == input.StopPrice ||
                    (this.StopPrice != null &&
                    this.StopPrice.Equals(input.StopPrice))
                ) && 
                (
                    this.MaxFloor == input.MaxFloor ||
                    (this.MaxFloor != null &&
                    this.MaxFloor.Equals(input.MaxFloor))
                ) && 
                (
                    this.MinQuantity == input.MinQuantity ||
                    (this.MinQuantity != null &&
                    this.MinQuantity.Equals(input.MinQuantity))
                ) && 
                (
                    this.SettlementType == input.SettlementType ||
                    this.SettlementType.Equals(input.SettlementType)
                ) && 
                (
                    this.SettlementDate == input.SettlementDate ||
                    (this.SettlementDate != null &&
                    this.SettlementDate.Equals(input.SettlementDate))
                ) && 
                (
                    this.ExecutionInstructions == input.ExecutionInstructions ||
                    this.ExecutionInstructions.Equals(input.ExecutionInstructions)
                ) && 
                (
                    this.LocateRequired == input.LocateRequired ||
                    (this.LocateRequired != null &&
                    this.LocateRequired.Equals(input.LocateRequired))
                ) && 
                (
                    this.Text == input.Text ||
                    (this.Text != null &&
                    this.Text.Equals(input.Text))
                ) && 
                (
                    this.UserDefinedFields == input.UserDefinedFields ||
                    this.UserDefinedFields != null &&
                    input.UserDefinedFields != null &&
                    this.UserDefinedFields.SequenceEqual(input.UserDefinedFields)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.TicketId != null)
                {
                    hashCode = (hashCode * 59) + this.TicketId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.OrderType.GetHashCode();
                if (this.OrderQuantity != null)
                {
                    hashCode = (hashCode * 59) + this.OrderQuantity.GetHashCode();
                }
                if (this.Price != null)
                {
                    hashCode = (hashCode * 59) + this.Price.GetHashCode();
                }
                if (this.TimeInForce != null)
                {
                    hashCode = (hashCode * 59) + this.TimeInForce.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.HandlingInstructions.GetHashCode();
                if (this.StopPrice != null)
                {
                    hashCode = (hashCode * 59) + this.StopPrice.GetHashCode();
                }
                if (this.MaxFloor != null)
                {
                    hashCode = (hashCode * 59) + this.MaxFloor.GetHashCode();
                }
                if (this.MinQuantity != null)
                {
                    hashCode = (hashCode * 59) + this.MinQuantity.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.SettlementType.GetHashCode();
                if (this.SettlementDate != null)
                {
                    hashCode = (hashCode * 59) + this.SettlementDate.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ExecutionInstructions.GetHashCode();
                if (this.LocateRequired != null)
                {
                    hashCode = (hashCode * 59) + this.LocateRequired.GetHashCode();
                }
                if (this.Text != null)
                {
                    hashCode = (hashCode * 59) + this.Text.GetHashCode();
                }
                if (this.UserDefinedFields != null)
                {
                    hashCode = (hashCode * 59) + this.UserDefinedFields.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            // OrderQuantity (double?) minimum
            if (this.OrderQuantity < (double?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for OrderQuantity, must be a value greater than or equal to 0.", new [] { "OrderQuantity" });
            }

            // Text (string) maxLength
            if (this.Text != null && this.Text.Length > 250)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Text, length must be less than 250.", new [] { "Text" });
            }

            yield break;
        }
    }

}
