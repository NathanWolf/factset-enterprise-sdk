package com.factset.sdk.FactSetESG.api;

import com.factset.sdk.FactSetESG.ApiException;
import com.factset.sdk.FactSetESG.ApiClient;
import com.factset.sdk.FactSetESG.ApiResponse;
import com.factset.sdk.FactSetESG.Configuration;
import com.factset.sdk.FactSetESG.Pair;

import jakarta.ws.rs.core.GenericType;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.factset.sdk.FactSetESG.models.ErrorResponse;
import com.factset.sdk.FactSetESG.models.SdgScoresRequest;
import com.factset.sdk.FactSetESG.models.SdgScoresResponse;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SdgApi {
  private ApiClient apiClient;

  public SdgApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SdgApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
  
  private static final Map<Integer, GenericType> getSdgScoresResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSdgScoresResponseTypeMap.put(200, new GenericType<SdgScoresResponse>(){});
    getSdgScoresResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSdgScoresResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSdgScoresResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSdgScoresResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSdgScoresResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  private static final Map<Integer, GenericType> getSdgScoresPostResponseTypeMap = new HashMap<Integer, GenericType>();
  static {
    getSdgScoresPostResponseTypeMap.put(200, new GenericType<SdgScoresResponse>(){});
    getSdgScoresPostResponseTypeMap.put(400, new GenericType<ErrorResponse>(){});
    getSdgScoresPostResponseTypeMap.put(401, new GenericType<ErrorResponse>(){});
    getSdgScoresPostResponseTypeMap.put(403, new GenericType<ErrorResponse>(){});
    getSdgScoresPostResponseTypeMap.put(415, new GenericType<ErrorResponse>(){});
    getSdgScoresPostResponseTypeMap.put(500, new GenericType<ErrorResponse>(){});
  }

  


  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Gets short-term, long-term, and momentum scores based on the 16 Sustainable Development Goals categories defined by the United Nations.
   * Truvalue Labs SDG Scores provides short-term, long-term, and momentum scores that are generated for 16 Sustainable Development Goals categories defined by the United Nations. 
   * @param ids Security or Entity identifiers. ISIN, Truvalue Identifiers, instrumentTvlId, instrumentPermId, and Tickers are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param scoreTypes The FactSet Truvalue Score types being requested. Score Types include the Pulse, Insight, Momentum, Article Volume, Category Volume, Dynamic Materiality Score, Adjusted Insight, and Industry Percentile. When left blank all score types will be returned for the requested Id. To specify select scores returned in the response, provide a comma-separated list of the scores using the description below. &lt;p&gt;These scores use the same underlying data and 100-point scale, except for ranks and percentiles. The cognitive computing system behind FactSet&#39;s Truvalue Platform uses natural language processing to interpret semantic content and generate analytics. It does so by applying criteria that are consistent with established sustainability and ESG frameworks, scoring data points on performance using a 0 to 100 scale. A score of 50 represents a neutral impact. Scores above 50 indicate positive performance, and scores below reflect negative performance.&lt;/p&gt;  ### SDG Score Types  |**SDG Category Input**|**Description**| |---|---| |**PULSE**|*Pulse Score*, is a measure of near-term performance changes that highlights opportunities and controversies, enabling real-time monitoring of companies. It focuses on events of the day and provides a responsive signal to alert investors to dynamic moves.| |**INSIGHT**|*Insight Score*, a measure of a company&#39;s longer-term SDG track record, similar to a ratings system. Scores are less sensitive to daily events and reflect the enduring performance record of a company over time. Scores are derived using an exponentially-weighted moving average of the Pulse, defined below, and the half-life of an event&#39;s influence on the overall score is 6 months.| |**MOMENTUM**|*Momentum Score*, measures the trend of a company&#39;s Insight score. It is a unique ESG metric in the industry that gives investors a high-precision view of the trajectory of a company&#39;s SDG performance, relative to peers. It does so by precisely articulating upward or downward movement, relative to that of all others in the universe, making it a measure that enhances quantitative workflows.| |**DYNAMIC_MAT**|*Dynamic Materiality Score*, shows the percentage value of data flow by category compared with the total data flow for the organization | |**ADJ_INSIGHT**|*Adjusted Insight*, Measures company SDG performance, generating scores for lower-volume and zero-volume firms by blending company scores with industry medians. **(ONLY Vaild for &#x60;IMPACT&#x60; category)**. &lt;p&gt;**Adjusted Insight Score &#x3D; (# of articles / 5) x Company Insight Score + ((5 - # of articles) / 5) x Industry (or Sector) Median Insight Score.&lt;/p&gt;| |**IND_PCTL**|*Industry Percentile*, offers context on company Adjusted Insight scores relative to peers in the same SICS Industry. This value is used to establish the textual ESG Rank. **(ONLY Vaild for &#x60;IMPACT&#x60; category).**| |**TTM_VOLUME**|*TTM Volume*, measures the data flow over a trailing twelve month period.| |**SDG_RANK**|*SDG Rank*, offers rank leveraging the 16 ESG categories defined by Sustainable Development Goals (SDG).The datatype for the data returned when this score types is requested is String**(ONLY Vaild for &#x60;IMPACT&#x60; category)**.|  (optional, default to [\&quot;ALL\&quot;])
   * @param categories The SDG Categories specified for the Truvalue Scores being requested. To specify select categories returned in the response, provide a comma-separated list of the scores using the description below.  |**SDG Category Input**|**Description**| |---|---| |**IMPACT**|**Impact** - The aggregate SDG score for each company is simply named \&quot;Impact.\&quot; The SDG Impact Score is produced using a weighted average of individual category scores, where the weight utilized is the category score volume.| |**IMPACTARTICLES**|**Impact Articles** - The All Goals Category Volume measures the total number of times any of the 16 goals received a score over a trailing twelve-month (TTM) period of time. **( Data wil be returned only for &#x60;TTM_VOLUME&#x60; score type)**|        |**GOAL1NOPOVERTY**|**No Poverty** - Goal 1 focuses on poverty in all its manifestations and also aims to ensure social protection for the poor and vulnerable, increase access to basic services and support people harmed by climate related extreme events and other economic, social and environmental shocks and disasters. &lt;p&gt;**Company-Level Issue Examples** *- Financial services access and affordability, Underserved groups,Unethical pricing.*| |**GOAL2ZEROHUNGER**|**Zero Hunger** - Goal 2 aims to end hunger and all forms of malnutrition and commits to universal access to safe, nutritious and sufficient food at all times of the year, particularly for the poor and people in vulnerable situations (e.g., infants). This will require sustainable food production systems and resilient agricultural practices, equal access to land, technology, and markets and international cooperation on investments in infrastructure and technology to boost agricultural productivity. &lt;p&gt;**Company-Level Issue Examples** *- Sustainable agricultural practices, Agricultural ingredients sourcing and certifications, Food safety concerns, Animal welfare.*| |**GOAL3GOODHEALTHANDWELLBEING**|**Good Health and Wellbeing** - Goal 3 seeks to ensure health and wellbeing for all, at every stage of life and addresses all major health priorities, including reproductive, maternal, and child health; communicable, noncommunicable and environmental diseases; universal health coverage; and access for all to safe, effective, quality, and affordable medicines and vaccines.&lt;p&gt; **Company-Level Issue Examples** *- Harmful Chemicals in Products, Product Recalls, Healthcare Access and Affordability.*| |**GOAL4QUALITYEDUCATION**|**Quality Education** - Goal 4 addresses access and affordability of education and skills development starting from childhood development and continuing through adulthood, including for girls, persons with disabilities, indigenous peoples and children in vulnerable situations, Improvements to the access to education it hopes to ensure that all youth and a substantial proportion of adults achieve literacy and numeracy. It also seeks to build and upgrade education facilities and to increase the supply of qualified teachers.&lt;p&gt;**Company-Level Issue Examples** *- Mentorship and training, Education company quality, Education company ethics.*| |**GOAL5GENDEREQUALITY**|**Gender Equality** - Goal 5 emphasizes eliminating discrimination and violence against women and girls. The Goal emphasizes ensuring women&#39;s full and effective participation and equal opportunities for leadership at all levels of decision-making in political, economic and public life. Access to sexual and reproductive health and reproductive rights and access to economic resources (e.g., land ownership, financial services) are also emphasized.&lt;p&gt;**Company-Level Issue Examples** *- Board Diversity, Gender Discrimination, Sexual Harassment.*| |**GOAL6CLEANWATERANDSANITATION**|**Clean Water and Sanitation** - Goal 6 not only addresses issues relating to drinking water, sanitation and hygiene, but also the quality and sustainability of water resources worldwide. It strives to achieve universal and equitable access to safe and affordable drinking water for all. It also focuses on adequate and equitable sanitation and hygiene and reducing pollution, minimizing release of hazardous chemicals and materials, and protection of water-related ecosystems. It also highlights increasing water-use efficiency across all sectors, recycling, and ensuring sustainable withdrawals and supply of freshwater.&lt;p&gt;**Company-Level Issue Examples** *- Water Pollution, Water Recycling and Stewardship, Water Infrastructure.*| |**GOAL7AFFORDABLEANDCLEANENERGY**|**Goal 7 Affordable and Clean Energy** - Goal 7 seeks to ensure access to affordable, reliable, and modern energy services for all. It aims to increase renewable energy in the global energy mix and improve energy efficiency significantly. It also calls for more access to clean energy research, technology, and infrastructure for renewable energy, energy efficiency, and advanced and cleaner fossil-fuel technology, and promoting investment in energy infrastructure and clean energy technology.&lt;p&gt;**Company-Level Issue Examples** *- Green Buildings, Renewable Energy, Unethical Utility Pricing.*| |**GOAL8DECENTWORKANDECONOMICGROWTH**|**Decent Work and Economic Growth** - Goal 8 focuses on economic productivity and supports policies for entrepreneurship, creativity and innovation that assist micro, small, and medium-sized enterprises. The Goal also seeks to reduce unemployment, the proportion of youth not working or in school, child labor, and forced labor. Also covered are the protection of labor rights, migrant workers, safe and secure working environments, sustainable tourism, and increasing the capacity of domestic financial institutions in regards to access to banking, insurance, and financial services.&lt;p&gt;**Company-Level Issue Examples** *-  Job Creation, Labor Exploitation, Employee Health and Safety, Workplace Turnover, Supplier Transparency.*| |**GOAL9INDUSTRYINNOVATIONANDINFRASTRUCTURE**|**Industry Innovation and Infrastructure** - Goal 9 focuses on three important aspects of sustainable development, infrastructure, industrialization and innovation, including considerations for resiliency, equity, quality, reliability, access and affordability, and regional and transborder infrastructure. The Goal focuses on infrastructure upgrades and retrofitting of industries with increased resource-use efficiency and clean and environmentally sound technologies and industrial processes.&lt;p&gt;**Company-Level Issue Examples** *- Digital Divide, ESG integration in financial services, Engineering Structural Integrity.*| |**GOAL10REDUCEDINEQUALITIES**|**Reduced Inequalities** - Goal 10 calls for reducing inequalities in income as well as those based on age, sex, disability, race, ethnicity, origin, religion, or economic or other status within a country. The Goal addresses inequalities among countries, including those related to representation, migration, and development assistance. It aims to empower and promote social, economic, and political inclusion of all. The Goal stresses regulation and monitoring of global financial markets and institutions.&lt;p&gt;**Company-Level Issue Examples** *- Responsible Lending, Worker Discrimination, CEO Pay Gap, Worker Pay Gap, Workplace Diversity and Inclusion.*| |**GOAL11SUSTAINABLECITIESANDCOMMUNITIES**|**Sustainable Cities and Communities** - Goal 11 seeks to ensure access for all to adequate, safe, and affordable housing and basic services, and green and public spaces, and to upgrade slums. It focuses on improving transportation, air quality and municipal and other waste management, and creating inclusive and sustainable urbanization through participatory urban planning. The Goal also supports safeguarding the world&#39;s cultural and natural heritage, while aiming to increase the number of cities and human settlements adopting and implementing integrated policies and plans towards inclusion, resource efficiency, mitigation and adaptation to climate change, and resilience to disasters.&lt;p&gt;**Company-Level Issue Examples** *- Air Pollution, Environmental Justice, Human Rights Violations, Affordable Housing.*| |**GOAL12RESPONSIBLECONSUMPTIONANDPRODUCTION**|**Responsible Consumption and Production** - Goal 12 aims to achieve the sustainable management and efficient use of natural resources through both the public and private sector. It specifically addresses global food waste in consumption, production, and distribution, sustainable tourism, waste and chemicals management. Goal 12 encourages sustainability reporting in the private sector, while in the public sector it encourages restructuring taxation and subsidies for fossil fuels and promoting sustainable public procurement practices.&lt;p&gt;**Company-Level Issue Examples** *- Sustainability Reporting, Circular Economy, Hazardous Waste Management, Waste Reduction.*| |**GOAL13CLIMATEACTION**|**Climate Action** - While Goal 13 is focused on actions by countries towards climate mitigation and adaptation, the private sector can also play a role in these areas. The goal seeks to strengthen resilience and adaptive capacity to climate-related hazards and natural disasters in all countries. It calls for integrating climate change measures, including those related to climate resilience and low GHG development, into national policies, strategies, and planning. It aims to improve education and awareness of climate change mitigation, adaptation, impact reduction, and early warning.&lt;p&gt;**Company-Level Issue Examples** *- GHG Emissions, Sustainable Transportation, Physical Climate Impacts.*| |**GOAL14LIFEBELOWWATER**|**Life Below Water** - Goal 14 focuses on preventing marine pollution of all kinds, particularly from land-based activities, and to minimize and address the impacts of ocean acidification. The Goal also aims to achieve sustainable yields in fisheries, through regulation of harvesting, controlling subsidies, and ending overfishing. It seeks to sustainably manage and protect marine and coastal ecosystems to avoid significant adverse impacts, including by strengthening their resilience, and take action for their restoration in order to achieve healthy and productive oceans.&lt;p&gt;**Company-Level Issue Examples** *- Impacts on water-related endangered species and habitats, Oil Spills, Seafood Sourcing.*| |**GOAL15LIFEONLAND**|**Life On Land** - Goal 15 seeks to ensure the conservation, restoration, and sustainable use of terrestrial and inland freshwater ecosystems and their services, in order to preserve biodiversity. It focuses specifically on sustainably managing forests, halting deforestation, restoring degraded lands and successfully combating desertification, reducing degraded natural habitats and ending biodiversity loss, with an emphasis on threatened species and invasive alien species.&lt;p&gt;**Company-Level Issue Examples** *- Impacts on land-related endangered species and habitats, Sustainable forestry practices and certifications, Project lifecycle environmental impacts.*| |**GOAL16PEACEJUSTICEANDSTRONGINSTITUTIONS**|**Peace, Justice, and Strong Institutions** - Goal 16 aims to significantly reduce all forms of violence, and also focuses specifically on reducing violence against children in the forms of abuse, exploitation, trafficking, and torture. It also aims to significantly reduce illicit financial and arms flows and to substantially reduce corruption and bribery in all their forms. The Goal also emphasizes effective and transparent institutions at all levels, inclusive and participatory decision-making, ensuring public access to information, and protection of fundamental freedoms.&lt;p&gt;**Company-Level Issue Examples** *- Tax Avoidance, Anti-Competitive Behavior, Cyber Security, Corruption, ESG Resolutions.*|  (optional, default to [\&quot;IMPACT\&quot;])
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily data (to receive most recent day&#39;s values, you must use daily frequency).   * **W** &#x3D; Weekly, End of week as of UTC Sunday at 12 AM.   * **M** &#x3D; Monthly, End of month as of UTC 12 AM.   * **CY** &#x3D; Yearly, End of year as of UTC 12 AM.     (optional, default to M)
   * @return SdgScoresResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The SDG Scores response object, including the Pulse Score, Insight Score, Momentum Score, Category Volume, Impact Percentage and other meta data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SdgScoresResponse getSdgScores(java.util.List<String> ids, String startDate, String endDate, java.util.List<String> scoreTypes, java.util.List<String> categories, String frequency) throws ApiException {
    return getSdgScoresWithHttpInfo(ids, startDate, endDate, scoreTypes, categories, frequency).getData();
  }

  /**
   * Gets short-term, long-term, and momentum scores based on the 16 Sustainable Development Goals categories defined by the United Nations.
   * Truvalue Labs SDG Scores provides short-term, long-term, and momentum scores that are generated for 16 Sustainable Development Goals categories defined by the United Nations. 
   * @param ids Security or Entity identifiers. ISIN, Truvalue Identifiers, instrumentTvlId, instrumentPermId, and Tickers are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required)
   * @param startDate The start date requested for a given date range in YYYY-MM-DD format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param endDate The end date requested for a given date range in YYYY-MM-DD format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint.  (required)
   * @param scoreTypes The FactSet Truvalue Score types being requested. Score Types include the Pulse, Insight, Momentum, Article Volume, Category Volume, Dynamic Materiality Score, Adjusted Insight, and Industry Percentile. When left blank all score types will be returned for the requested Id. To specify select scores returned in the response, provide a comma-separated list of the scores using the description below. &lt;p&gt;These scores use the same underlying data and 100-point scale, except for ranks and percentiles. The cognitive computing system behind FactSet&#39;s Truvalue Platform uses natural language processing to interpret semantic content and generate analytics. It does so by applying criteria that are consistent with established sustainability and ESG frameworks, scoring data points on performance using a 0 to 100 scale. A score of 50 represents a neutral impact. Scores above 50 indicate positive performance, and scores below reflect negative performance.&lt;/p&gt;  ### SDG Score Types  |**SDG Category Input**|**Description**| |---|---| |**PULSE**|*Pulse Score*, is a measure of near-term performance changes that highlights opportunities and controversies, enabling real-time monitoring of companies. It focuses on events of the day and provides a responsive signal to alert investors to dynamic moves.| |**INSIGHT**|*Insight Score*, a measure of a company&#39;s longer-term SDG track record, similar to a ratings system. Scores are less sensitive to daily events and reflect the enduring performance record of a company over time. Scores are derived using an exponentially-weighted moving average of the Pulse, defined below, and the half-life of an event&#39;s influence on the overall score is 6 months.| |**MOMENTUM**|*Momentum Score*, measures the trend of a company&#39;s Insight score. It is a unique ESG metric in the industry that gives investors a high-precision view of the trajectory of a company&#39;s SDG performance, relative to peers. It does so by precisely articulating upward or downward movement, relative to that of all others in the universe, making it a measure that enhances quantitative workflows.| |**DYNAMIC_MAT**|*Dynamic Materiality Score*, shows the percentage value of data flow by category compared with the total data flow for the organization | |**ADJ_INSIGHT**|*Adjusted Insight*, Measures company SDG performance, generating scores for lower-volume and zero-volume firms by blending company scores with industry medians. **(ONLY Vaild for &#x60;IMPACT&#x60; category)**. &lt;p&gt;**Adjusted Insight Score &#x3D; (# of articles / 5) x Company Insight Score + ((5 - # of articles) / 5) x Industry (or Sector) Median Insight Score.&lt;/p&gt;| |**IND_PCTL**|*Industry Percentile*, offers context on company Adjusted Insight scores relative to peers in the same SICS Industry. This value is used to establish the textual ESG Rank. **(ONLY Vaild for &#x60;IMPACT&#x60; category).**| |**TTM_VOLUME**|*TTM Volume*, measures the data flow over a trailing twelve month period.| |**SDG_RANK**|*SDG Rank*, offers rank leveraging the 16 ESG categories defined by Sustainable Development Goals (SDG).The datatype for the data returned when this score types is requested is String**(ONLY Vaild for &#x60;IMPACT&#x60; category)**.|  (optional, default to [\&quot;ALL\&quot;])
   * @param categories The SDG Categories specified for the Truvalue Scores being requested. To specify select categories returned in the response, provide a comma-separated list of the scores using the description below.  |**SDG Category Input**|**Description**| |---|---| |**IMPACT**|**Impact** - The aggregate SDG score for each company is simply named \&quot;Impact.\&quot; The SDG Impact Score is produced using a weighted average of individual category scores, where the weight utilized is the category score volume.| |**IMPACTARTICLES**|**Impact Articles** - The All Goals Category Volume measures the total number of times any of the 16 goals received a score over a trailing twelve-month (TTM) period of time. **( Data wil be returned only for &#x60;TTM_VOLUME&#x60; score type)**|        |**GOAL1NOPOVERTY**|**No Poverty** - Goal 1 focuses on poverty in all its manifestations and also aims to ensure social protection for the poor and vulnerable, increase access to basic services and support people harmed by climate related extreme events and other economic, social and environmental shocks and disasters. &lt;p&gt;**Company-Level Issue Examples** *- Financial services access and affordability, Underserved groups,Unethical pricing.*| |**GOAL2ZEROHUNGER**|**Zero Hunger** - Goal 2 aims to end hunger and all forms of malnutrition and commits to universal access to safe, nutritious and sufficient food at all times of the year, particularly for the poor and people in vulnerable situations (e.g., infants). This will require sustainable food production systems and resilient agricultural practices, equal access to land, technology, and markets and international cooperation on investments in infrastructure and technology to boost agricultural productivity. &lt;p&gt;**Company-Level Issue Examples** *- Sustainable agricultural practices, Agricultural ingredients sourcing and certifications, Food safety concerns, Animal welfare.*| |**GOAL3GOODHEALTHANDWELLBEING**|**Good Health and Wellbeing** - Goal 3 seeks to ensure health and wellbeing for all, at every stage of life and addresses all major health priorities, including reproductive, maternal, and child health; communicable, noncommunicable and environmental diseases; universal health coverage; and access for all to safe, effective, quality, and affordable medicines and vaccines.&lt;p&gt; **Company-Level Issue Examples** *- Harmful Chemicals in Products, Product Recalls, Healthcare Access and Affordability.*| |**GOAL4QUALITYEDUCATION**|**Quality Education** - Goal 4 addresses access and affordability of education and skills development starting from childhood development and continuing through adulthood, including for girls, persons with disabilities, indigenous peoples and children in vulnerable situations, Improvements to the access to education it hopes to ensure that all youth and a substantial proportion of adults achieve literacy and numeracy. It also seeks to build and upgrade education facilities and to increase the supply of qualified teachers.&lt;p&gt;**Company-Level Issue Examples** *- Mentorship and training, Education company quality, Education company ethics.*| |**GOAL5GENDEREQUALITY**|**Gender Equality** - Goal 5 emphasizes eliminating discrimination and violence against women and girls. The Goal emphasizes ensuring women&#39;s full and effective participation and equal opportunities for leadership at all levels of decision-making in political, economic and public life. Access to sexual and reproductive health and reproductive rights and access to economic resources (e.g., land ownership, financial services) are also emphasized.&lt;p&gt;**Company-Level Issue Examples** *- Board Diversity, Gender Discrimination, Sexual Harassment.*| |**GOAL6CLEANWATERANDSANITATION**|**Clean Water and Sanitation** - Goal 6 not only addresses issues relating to drinking water, sanitation and hygiene, but also the quality and sustainability of water resources worldwide. It strives to achieve universal and equitable access to safe and affordable drinking water for all. It also focuses on adequate and equitable sanitation and hygiene and reducing pollution, minimizing release of hazardous chemicals and materials, and protection of water-related ecosystems. It also highlights increasing water-use efficiency across all sectors, recycling, and ensuring sustainable withdrawals and supply of freshwater.&lt;p&gt;**Company-Level Issue Examples** *- Water Pollution, Water Recycling and Stewardship, Water Infrastructure.*| |**GOAL7AFFORDABLEANDCLEANENERGY**|**Goal 7 Affordable and Clean Energy** - Goal 7 seeks to ensure access to affordable, reliable, and modern energy services for all. It aims to increase renewable energy in the global energy mix and improve energy efficiency significantly. It also calls for more access to clean energy research, technology, and infrastructure for renewable energy, energy efficiency, and advanced and cleaner fossil-fuel technology, and promoting investment in energy infrastructure and clean energy technology.&lt;p&gt;**Company-Level Issue Examples** *- Green Buildings, Renewable Energy, Unethical Utility Pricing.*| |**GOAL8DECENTWORKANDECONOMICGROWTH**|**Decent Work and Economic Growth** - Goal 8 focuses on economic productivity and supports policies for entrepreneurship, creativity and innovation that assist micro, small, and medium-sized enterprises. The Goal also seeks to reduce unemployment, the proportion of youth not working or in school, child labor, and forced labor. Also covered are the protection of labor rights, migrant workers, safe and secure working environments, sustainable tourism, and increasing the capacity of domestic financial institutions in regards to access to banking, insurance, and financial services.&lt;p&gt;**Company-Level Issue Examples** *-  Job Creation, Labor Exploitation, Employee Health and Safety, Workplace Turnover, Supplier Transparency.*| |**GOAL9INDUSTRYINNOVATIONANDINFRASTRUCTURE**|**Industry Innovation and Infrastructure** - Goal 9 focuses on three important aspects of sustainable development, infrastructure, industrialization and innovation, including considerations for resiliency, equity, quality, reliability, access and affordability, and regional and transborder infrastructure. The Goal focuses on infrastructure upgrades and retrofitting of industries with increased resource-use efficiency and clean and environmentally sound technologies and industrial processes.&lt;p&gt;**Company-Level Issue Examples** *- Digital Divide, ESG integration in financial services, Engineering Structural Integrity.*| |**GOAL10REDUCEDINEQUALITIES**|**Reduced Inequalities** - Goal 10 calls for reducing inequalities in income as well as those based on age, sex, disability, race, ethnicity, origin, religion, or economic or other status within a country. The Goal addresses inequalities among countries, including those related to representation, migration, and development assistance. It aims to empower and promote social, economic, and political inclusion of all. The Goal stresses regulation and monitoring of global financial markets and institutions.&lt;p&gt;**Company-Level Issue Examples** *- Responsible Lending, Worker Discrimination, CEO Pay Gap, Worker Pay Gap, Workplace Diversity and Inclusion.*| |**GOAL11SUSTAINABLECITIESANDCOMMUNITIES**|**Sustainable Cities and Communities** - Goal 11 seeks to ensure access for all to adequate, safe, and affordable housing and basic services, and green and public spaces, and to upgrade slums. It focuses on improving transportation, air quality and municipal and other waste management, and creating inclusive and sustainable urbanization through participatory urban planning. The Goal also supports safeguarding the world&#39;s cultural and natural heritage, while aiming to increase the number of cities and human settlements adopting and implementing integrated policies and plans towards inclusion, resource efficiency, mitigation and adaptation to climate change, and resilience to disasters.&lt;p&gt;**Company-Level Issue Examples** *- Air Pollution, Environmental Justice, Human Rights Violations, Affordable Housing.*| |**GOAL12RESPONSIBLECONSUMPTIONANDPRODUCTION**|**Responsible Consumption and Production** - Goal 12 aims to achieve the sustainable management and efficient use of natural resources through both the public and private sector. It specifically addresses global food waste in consumption, production, and distribution, sustainable tourism, waste and chemicals management. Goal 12 encourages sustainability reporting in the private sector, while in the public sector it encourages restructuring taxation and subsidies for fossil fuels and promoting sustainable public procurement practices.&lt;p&gt;**Company-Level Issue Examples** *- Sustainability Reporting, Circular Economy, Hazardous Waste Management, Waste Reduction.*| |**GOAL13CLIMATEACTION**|**Climate Action** - While Goal 13 is focused on actions by countries towards climate mitigation and adaptation, the private sector can also play a role in these areas. The goal seeks to strengthen resilience and adaptive capacity to climate-related hazards and natural disasters in all countries. It calls for integrating climate change measures, including those related to climate resilience and low GHG development, into national policies, strategies, and planning. It aims to improve education and awareness of climate change mitigation, adaptation, impact reduction, and early warning.&lt;p&gt;**Company-Level Issue Examples** *- GHG Emissions, Sustainable Transportation, Physical Climate Impacts.*| |**GOAL14LIFEBELOWWATER**|**Life Below Water** - Goal 14 focuses on preventing marine pollution of all kinds, particularly from land-based activities, and to minimize and address the impacts of ocean acidification. The Goal also aims to achieve sustainable yields in fisheries, through regulation of harvesting, controlling subsidies, and ending overfishing. It seeks to sustainably manage and protect marine and coastal ecosystems to avoid significant adverse impacts, including by strengthening their resilience, and take action for their restoration in order to achieve healthy and productive oceans.&lt;p&gt;**Company-Level Issue Examples** *- Impacts on water-related endangered species and habitats, Oil Spills, Seafood Sourcing.*| |**GOAL15LIFEONLAND**|**Life On Land** - Goal 15 seeks to ensure the conservation, restoration, and sustainable use of terrestrial and inland freshwater ecosystems and their services, in order to preserve biodiversity. It focuses specifically on sustainably managing forests, halting deforestation, restoring degraded lands and successfully combating desertification, reducing degraded natural habitats and ending biodiversity loss, with an emphasis on threatened species and invasive alien species.&lt;p&gt;**Company-Level Issue Examples** *- Impacts on land-related endangered species and habitats, Sustainable forestry practices and certifications, Project lifecycle environmental impacts.*| |**GOAL16PEACEJUSTICEANDSTRONGINSTITUTIONS**|**Peace, Justice, and Strong Institutions** - Goal 16 aims to significantly reduce all forms of violence, and also focuses specifically on reducing violence against children in the forms of abuse, exploitation, trafficking, and torture. It also aims to significantly reduce illicit financial and arms flows and to substantially reduce corruption and bribery in all their forms. The Goal also emphasizes effective and transparent institutions at all levels, inclusive and participatory decision-making, ensuring public access to information, and protection of fundamental freedoms.&lt;p&gt;**Company-Level Issue Examples** *- Tax Avoidance, Anti-Competitive Behavior, Cyber Security, Corruption, ESG Resolutions.*|  (optional, default to [\&quot;IMPACT\&quot;])
   * @param frequency Controls the display frequency of the data returned.   * **D** &#x3D; Daily data (to receive most recent day&#39;s values, you must use daily frequency).   * **W** &#x3D; Weekly, End of week as of UTC Sunday at 12 AM.   * **M** &#x3D; Monthly, End of month as of UTC 12 AM.   * **CY** &#x3D; Yearly, End of year as of UTC 12 AM.     (optional, default to M)
   * @return ApiResponse&lt;SdgScoresResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The SDG Scores response object, including the Pulse Score, Insight Score, Momentum Score, Category Volume, Impact Percentage and other meta data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SdgScoresResponse> getSdgScoresWithHttpInfo(java.util.List<String> ids, String startDate, String endDate, java.util.List<String> scoreTypes, java.util.List<String> categories, String frequency) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ids' is set
    if (ids == null) {
      throw new ApiException(400, "Missing the required parameter 'ids' when calling getSdgScores");
    }
    
    // verify the required parameter 'startDate' is set
    if (startDate == null) {
      throw new ApiException(400, "Missing the required parameter 'startDate' when calling getSdgScores");
    }
    
    // verify the required parameter 'endDate' is set
    if (endDate == null) {
      throw new ApiException(400, "Missing the required parameter 'endDate' when calling getSdgScores");
    }
    
    // create path and map variables
    String localVarPath = "/factset-esg/v1/sdg-scores";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "ids", ids));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "scoreTypes", scoreTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "categories", categories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "frequency", frequency));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SdgScoresResponse
      
    > apiResponse = apiClient.invokeAPI("SdgApi.getSdgScores", localVarPath, "GET", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSdgScoresResponseTypeMap, false);

    return apiResponse;

  }
  /**
   * Gets short-term, long-term, and momentum scores based on the 16 Sustainable Development Goals categories defined by United Nations.
   * Truvalue Labs SDG Scores provides short-term, long-term, and momentum scores that are generated for 16 Sustainable Development Goals categories defined by the United Nations.* 
   * @param sdgScoresRequest The SDG Scores request body, allowing the user to specify a list of ids, Score types, SDG categories, date range, and frequency. (required)
   * @return SdgScoresResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The SDG Scores response object, including the Pulse Score, Insight Score, Momentum Score, Category Volume, Impact Percentage and other meta data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public SdgScoresResponse getSdgScoresPost(SdgScoresRequest sdgScoresRequest) throws ApiException {
    return getSdgScoresPostWithHttpInfo(sdgScoresRequest).getData();
  }

  /**
   * Gets short-term, long-term, and momentum scores based on the 16 Sustainable Development Goals categories defined by United Nations.
   * Truvalue Labs SDG Scores provides short-term, long-term, and momentum scores that are generated for 16 Sustainable Development Goals categories defined by the United Nations.* 
   * @param sdgScoresRequest The SDG Scores request body, allowing the user to specify a list of ids, Score types, SDG categories, date range, and frequency. (required)
   * @return ApiResponse&lt;SdgScoresResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> The SDG Scores response object, including the Pulse Score, Insight Score, Momentum Score, Category Volume, Impact Percentage and other meta data. </td><td>  -  </td></tr>
       <tr><td> 400 </td><td> Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> The USERNAME-SERIAL used to request the endpoint is not authorized to access it. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. </td><td>  -  </td></tr>
       <tr><td> 415 </td><td> Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal Server Error. </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SdgScoresResponse> getSdgScoresPostWithHttpInfo(SdgScoresRequest sdgScoresRequest) throws ApiException {
    Object localVarPostBody = sdgScoresRequest;
    
    // verify the required parameter 'sdgScoresRequest' is set
    if (sdgScoresRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sdgScoresRequest' when calling getSdgScoresPost");
    }
    
    // create path and map variables
    String localVarPath = "/factset-esg/v1/sdg-scores";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, String> localVarCookieParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "FactSetApiKey", "FactSetOAuth2", "FactSetOAuth2Client" };


    ApiResponse<
        
        SdgScoresResponse
      
    > apiResponse = apiClient.invokeAPI("SdgApi.getSdgScoresPost", localVarPath, "POST", localVarQueryParams, localVarPostBody,
                               localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType,
                               localVarAuthNames, getSdgScoresPostResponseTypeMap, false);

    return apiResponse;

  }
}
