package GetJsonData.util;

import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XMLtoJSON {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String xml = "<ClinicalDocument\r\n" + 
				"	xmlns=\"urn:hl7-org:v3\"\r\n" + 
				"	xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:hl7-org:v3 CDA.xsd\">\r\n" + 
				"	<typeId extension='POCD_HD000040' root='2.16.840.1.113883.1.3'/>\r\n" + 
				"	<!--  CCD v1.0 Templates Root  -->\r\n" + 
				"	<id root=\"6496701\" extension=\"2.16.458.1.100000.1.213\"/>\r\n" + 
				"	<code code=\"18842-5\" displayName=\"Discharge Summary\" codeSystem='2.16.840.1.113883.6.1' codeSystemName='LOINC'/>\r\n" + 
				"	<title>Discharge Summary for AZ ZAHRA BINTI ABDUL RAHMAN from Hospital Raja Permaisuri Bainun</title>\r\n" + 
				"	<effectiveTime value=\"20201021141801\"/>\r\n" + 
				"	<confidentialityCode code=\"R\" displayName=\"Restricted\"	codeSystem=\"2.16.840.1.113883.5.25\" codeSystemName='Confidentiality' />\r\n" + 
				"	<languageCode code=\"en-US\"/>\r\n" + 
				"	<setId extension=\"6496701\" root=\"2.16.458.1.100000.1.213\"/>\r\n" + 
				"	<recordTarget>\r\n" + 
				"		<patientRole>\r\n" + 
				"			<!-- Root OID is the Personal Physicians HealthCare NPI. Extension is John's medical record number. -->\r\n" + 
				"			<id extension=\"9bc3e30c-2bef-4485-9f25-b10dff1dc1b8\" root=\"2.16.458.1.100000.2.1\"/>\r\n" + 
				"			<addr use=\"H\">\r\n" + 
				"				<streetAddressLine>NO 84</streetAddressLine>\r\n" + 
				"				<city>Ipoh</city>\r\n" + 
				"				<state>Perak</state>\r\n" + 
				"				<postalCode></postalCode>\r\n" + 
				"			</addr>\r\n" + 
				"			<telecom value=\"\" use=\"H\"/>\r\n" + 
				"			<telecom value=\"tel:+\" use=\"WP\"/>\r\n" + 
				"			<telecom value=\"fax:+\" use=\"WP\"/>\r\n" + 
				"			<telecom value=\"mailto:011-64151456\" use=\"WP\"/>\r\n" + 
				"			<patient>\r\n" + 
				"				<name>\r\n" + 
				"					<given>AZ ZAHRA BINTI ABDUL RAHMAN</given>\r\n" + 
				"					<family></family>\r\n" + 
				"					<suffix></suffix>\r\n" + 
				"				</name>\r\n" + 
				"				<administrativeGenderCode code=\"M\"/>\r\n" + 
				"				<birthTime value=\"20191003\"/>\r\n" + 
				"				<raceCode displayName=\"Melayu\"/>\r\n" + 
				"			</patient>\r\n" + 
				"			<providerOrganization>\r\n" + 
				"				<!-- OID is the Personal Physicians HealthCare NPI -->\r\n" + 
				"				<id root=\"2.16.458.1.100000.1.213\"/>\r\n" + 
				"				<name>Hospital Raja Permaisuri Bainun</name>\r\n" + 
				"			</providerOrganization>\r\n" + 
				"		</patientRole>\r\n" + 
				"	</recordTarget>\r\n" + 
				"	<author>\r\n" + 
				"		<time value=\"20201021141801\"/>\r\n" + 
				"		<assignedAuthor>\r\n" + 
				"			<id extension=\"0\" root=\"2.16.458.1.100000.1.213\"/>\r\n" + 
				"			<assignedPerson>\r\n" + 
				"				<name>\r\n" + 
				"					<prefix>SUBHASHINI A/P BALASINGAM</prefix>\r\n" + 
				"					<given></given>\r\n" + 
				"					<family>MD</family>\r\n" + 
				"				</name>\r\n" + 
				"			</assignedPerson>\r\n" + 
				"			<representedOrganization>\r\n" + 
				"				<id extension=\"\" root=\"2.16.458.1.100000.1.213\"/>\r\n" + 
				"				<name>Hospital Raja Permaisuri Bainun</name>\r\n" + 
				"			</representedOrganization>\r\n" + 
				"		</assignedAuthor>\r\n" + 
				"	</author>\r\n" + 
				"	<custodian>\r\n" + 
				"		<assignedCustodian>\r\n" + 
				"			<representedCustodianOrganization>\r\n" + 
				"				<id root=\"2.16.458.1.100000.1.213\"/>\r\n" + 
				"				<name>Hospital Raja Permaisuri Bainun</name>\r\n" + 
				"			</representedCustodianOrganization>\r\n" + 
				"		</assignedCustodian>\r\n" + 
				"	</custodian>\r\n" + 
				"	<legalAuthenticator>\r\n" + 
				"		<time value=\"20201021141801\"/>\r\n" + 
				"		<signatureCode code=\"S\"/>\r\n" + 
				"		<assignedEntity>\r\n" + 
				"			<id extension=\"0\" root=\"2.16.458.1.100000.1.213\"/>\r\n" + 
				"			<assignedPerson>\r\n" + 
				"				<name>\r\n" + 
				"					<given>SUBHASHINI A/P BALASINGAM</given>\r\n" + 
				"					<family></family>\r\n" + 
				"					<suffix>MD</suffix>\r\n" + 
				"				</name>\r\n" + 
				"			</assignedPerson>\r\n" + 
				"			<representedOrganization>\r\n" + 
				"				<id root=\"2.16.458.1.100000.1.213\"/>\r\n" + 
				"				<name>Hospital Raja Permaisuri Bainun</name>\r\n" + 
				"			</representedOrganization>\r\n" + 
				"		</assignedEntity>\r\n" + 
				"	</legalAuthenticator>\r\n" + 
				"	<componentOf>\r\n" + 
				"		<encompassingEncounter>\r\n" + 
				"			<id extension=\"6496701\" root=\"2.16.458.1.100000.1.213\"/>\r\n" + 
				"			<effectiveTime>\r\n" + 
				"				<low value=\"20191003105907\"/>\r\n" + 
				"				<high value=\"20191101221412\"/>\r\n" + 
				"			</effectiveTime>\r\n" + 
				"			<encounterParticipant typeCode=\"CONS\">\r\n" + 
				"				<time value=\"20191003105907\"/>\r\n" + 
				"				<assignedEntity>\r\n" + 
				"					<id extension=\"0\" root=\"2.16.458.1.100000.1.213\"/>\r\n" + 
				"					<assignedPerson>\r\n" + 
				"						<name>\r\n" + 
				"							<given>SUBHASHINI A/P BALASINGAM</given>\r\n" + 
				"							<family></family>\r\n" + 
				"							<suffix>MD</suffix>\r\n" + 
				"						</name>\r\n" + 
				"					</assignedPerson>\r\n" + 
				"					<representedOrganization>\r\n" + 
				"						<id extension=\"\" root=\"2.16.458.1.100000.1.213\"/>\r\n" + 
				"					</representedOrganization>\r\n" + 
				"				</assignedEntity>\r\n" + 
				"			</encounterParticipant>\r\n" + 
				"			<location>\r\n" + 
				"				<healthCareFacility classCode=\"DSDLOC\">\r\n" + 
				"					<code code=\"GIM\" codeSystem=\"2.16.840.1.113883.5.111\" displayName=\"General internal medicine clinic\"/>\r\n" + 
				"				</healthCareFacility>\r\n" + 
				"			</location>\r\n" + 
				"		</encompassingEncounter>\r\n" + 
				"	</componentOf>\r\n" + 
				"	<component>\r\n" + 
				"		<structuredBody>\r\n" + 
				"			<!-- Active Problems -->\r\n" + 
				"			<component>\r\n" + 
				"				<section>\r\n" + 
				"					<code code=\"11450-4\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"Problem List\"/>\r\n" + 
				"					<title>Active Problems</title>\r\n" + 
				"					<text>\r\n" + 
				"						<paragraph>Baby&amp;#39;s details:</paragraph>\r\n" + 
				"						<paragraph>DOB: 3/10/19 </paragraph>\r\n" + 
				"						<paragraph>TOB: 0849H</paragraph>\r\n" + 
				"						<paragraph>Born via ELLSCS For severe bilateral ventriculomegaly</paragraph>\r\n" + 
				"						<paragraph>GA: 37 Weeks 3 days</paragraph>\r\n" + 
				"						<paragraph>AS: 8(1)9(5)</paragraph>\r\n" + 
				"						<paragraph>BW: 2.68kg</paragraph>\r\n" + 
				"						<paragraph>Length: 48cm</paragraph>\r\n" + 
				"						<paragraph>COH: 40cm</paragraph>\r\n" + 
				"						<paragraph>G6PD: Normal</paragraph>\r\n" + 
				"						<paragraph>Ctsh: 5.39 </paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>Mother&amp;#39;s history:</paragraph>\r\n" + 
				"						<paragraph>Age: 20 years</paragraph>\r\n" + 
				"						<paragraph>Para: 1</paragraph>\r\n" + 
				"						<paragraph>MBG: AB positive</paragraph>\r\n" + 
				"						<paragraph>HIV/ VDRL: NR</paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>ANC:</paragraph>\r\n" + 
				"						<paragraph>1.Fetus with severe ventriculomegaly with flattened nasal bridge and short femur</paragraph>\r\n" + 
				"						<paragraph>2.Single parent</paragraph>\r\n" + 
				"						<paragraph>3.Resolved anemia in pregnancy, booking Hb 10.3 , latest Hb 11.2</paragraph>\r\n" + 
				"						<paragraph>4.Late booker @ 35 weeks</paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>Called for standby ELLSCS for baby with severe ventriculomegaly. Baby born with good cry, mild flexion of the limb, HR 120, moving all 4 limbs, liquor clear. Rassessment at 1HOL, noted SPO2 fluctuates 88-92% under room air, RR 52. However, not tachypnoeic, no nasal flaring, no recession/grunting. Put on NPO2 2L/min, SPO2 99-100%, then to NPO2 1L/min, SPO2 100%. Able to weaned to room air at 2 1/2 HOL. Noted neonatal teeth over lower gum, partially detached (transluscent), and removed.</paragraph>\r\n" + 
				"						<paragraph>Child was admitted to NICU, then transferred out to 6C on the 16/10/19 once able to tolerate breastfeeding. </paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>Issues:</paragraph>\r\n" + 
				"						<paragraph>1. Post right VP shunt and procephalocele repair Fay 22</paragraph>\r\n" + 
				"						<paragraph>- under neurosurgical team</paragraph>\r\n" + 
				"						<paragraph>- child was on daily normal saline dressing over wound</paragraph>\r\n" + 
				"						<paragraph>- STO done on 25/10/19</paragraph>\r\n" + 
				"						<paragraph>- However noted minimal serous discharge over edge of VP shunt, resuturing done at scalp.</paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>2.Infant with multiple congenital anomalies (severe ventriculomegaly, encephaolcele, two transluscent teeth)</paragraph>\r\n" + 
				"						<paragraph>- referred to neurosurgical team</paragraph>\r\n" + 
				"						<paragraph>- CT Brain plain : Gross hydrocephalus</paragraph>\r\n" + 
				"						<paragraph>- MRI Brain: Features suggestive of dilated bilateral lateral ventricles and 3rd ventricles secondary to cerebral aqueduct stenosis, and underlying lobar holoprosecephaly. Features are likely parietal meningocoele.</paragraph>\r\n" + 
				"						<paragraph>- Done right ventriculoperitoneal shuntand encephalocele repair on 11/10/2019</paragraph>\r\n" + 
				"						<paragraph>- extubated on 13/10/19</paragraph>\r\n" + 
				"						<paragraph>- on IV Cefuroxime 130mg tds D4 (To complete 1/52 as per neurosurgical plan)</paragraph>\r\n" + 
				"						<paragraph>- STO Day 10 (21/10/19)</paragraph>\r\n" + 
				"						<paragraph>- latest COH 16/10/19: 36cm (reducing trend) </paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>3.Establising feeding</paragraph>\r\n" + 
				"						<paragraph>- tolerating breastfeeding every 2 hours for 30 minutes</paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>4.Infant of single parent</paragraph>\r\n" + 
				"						<paragraph>- already referred to social welfare</paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>5.TTN (Resolved)</paragraph>\r\n" + 
				"						<paragraph>- At 1HOL SPO2 fluctuates 88-92% under room air</paragraph>\r\n" + 
				"						<paragraph>- was put on NPO2</paragraph>\r\n" + 
				"						<paragraph>- Able to wean off oxygen at 2 1/2 HOL</paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>6.NNJ with moderate risk (resolved)</paragraph>\r\n" + 
				"						<paragraph>-LSB@ Day 14 of life 282(PL 257)</paragraph>\r\n" + 
				"						<paragraph>-Child started on conventional phototherapy on 7/10/19 for 1 day</paragraph>\r\n" + 
				"						<paragraph>-Phototherapy was off on 8/10</paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>7.Resolved transminitis</paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>Progress in 6C:</paragraph>\r\n" + 
				"						<paragraph>Tolerating breastfeeding on demand well </paragraph>\r\n" + 
				"						<paragraph>No vomiting</paragraph>\r\n" + 
				"						<paragraph>No temperature instability</paragraph>\r\n" + 
				"						<paragraph>PU BO regular</paragraph>\r\n" + 
				"						<paragraph>Wound clean and no discharge</paragraph>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"						<paragraph>O/E:</paragraph>\r\n" + 
				"						<paragraph>Active on handling, warm peripheries, good PV, CRT &lt; 2secs, not septic looking, not tachypnoeic, comfortable under room air</paragraph>\r\n" + 
				"						<paragraph>Lungs: clear</paragraph>\r\n" + 
				"						<paragraph>CVS: DRNM</paragraph>\r\n" + 
				"						<paragraph>P/A: Soft, not distended</paragraph>\r\n" + 
				"					</text>\r\n" + 
				"					<confidentialityCode code=\"R\" codeSystem=\"2.16.840.1.113883.5.25\"/>\r\n" + 
				"				</section>\r\n" + 
				"			</component>\r\n" + 
				"			<!-- Discharge Diagnosis -->\r\n" + 
				"			<component>\r\n" + 
				"				<section>\r\n" + 
				"					<code code=\"11535-2\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"HOSPITAL DISCHARGE DX\"/>\r\n" + 
				"					<title>Discharge Diagnosis</title>\r\n" + 
				"					<text>\r\n" + 
				"						<content ID=\"a1\">\r\n" + 
				"							<paragraph>Acute respiratory failure</paragraph>\r\n" + 
				"							<paragraph></paragraph>\r\n" + 
				"							<paragraph>Infant of single parent</paragraph>\r\n" + 
				"							<paragraph></paragraph>\r\n" + 
				"							<paragraph>TTN (Resolved)</paragraph>\r\n" + 
				"							<paragraph></paragraph>\r\n" + 
				"							<paragraph>NNJ with moderate risk (resolved)</paragraph>\r\n" + 
				"							<paragraph></paragraph>\r\n" + 
				"							<paragraph>Resolved transminitis</paragraph>\r\n" + 
				"							<paragraph></paragraph>\r\n" + 
				"							<paragraph>Infant with multiple congenital anomalies (severe ventriculomegaly, encephaolcele, two transluscent teeth)</paragraph>\r\n" + 
				"						</content>\r\n" + 
				"					</text>\r\n" + 
				"					<confidentialityCode code=\"R\" codeSystem=\"2.16.840.1.113883.5.25\"/>\r\n" + 
				"					<entry>\r\n" + 
				"						<observation classCode=\"COND\" moodCode=\"EVN\">\r\n" + 
				"							<code code=\"I11.0\" codeSystem=\"2.16.840.1.113883.6.3\" codeSystemName=\"ICD-10\" displayName=\"\">\r\n" + 
				"								<originalText>\r\n" + 
				"									<reference value=\"#a1\"/>\r\n" + 
				"								</originalText>\r\n" + 
				"							</code>\r\n" + 
				"						</observation>\r\n" + 
				"					</entry>\r\n" + 
				"				</section>\r\n" + 
				"			</component>\r\n" + 
				"			<!-- Resolved Problems -->\r\n" + 
				"			<component>\r\n" + 
				"				<section>\r\n" + 
				"					<code code=\"11348-0\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"HISTORY OF PAST ILLNESS\"/>\r\n" + 
				"					<title>Resolved Problems</title>\r\n" + 
				"					<text>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"					</text>\r\n" + 
				"					<confidentialityCode code=\"R\" codeSystem=\"2.16.840.1.113883.5.25\"/>\r\n" + 
				"				</section>\r\n" + 
				"			</component>\r\n" + 
				"			<!-- List of Surgeries -->\r\n" + 
				"			<component>\r\n" + 
				"				<section>\r\n" + 
				"					<code code=\"47519-4\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"HISTORY OF PROCEDURES\"/>\r\n" + 
				"					<title>List of surgeries</title>\r\n" + 
				"					<text>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"					</text>\r\n" + 
				"					<confidentialityCode code=\"R\" codeSystem=\"2.16.840.1.113883.5.25\"/>\r\n" + 
				"				</section>\r\n" + 
				"			</component>\r\n" + 
				"			<!-- Allergies And Adverse Reactions -->\r\n" + 
				"			<component>\r\n" + 
				"				<section>\r\n" + 
				"					<code code=\"48765-2\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"ALLERGIES, ADVERSE REACTIONS, ALERTS\"/>\r\n" + 
				"					<title>Allergies And Adverse Reactions</title>\r\n" + 
				"					<text>\"\r\n" + 
				"						<paragraph></paragraph>\"\r\n" + 
				"					</text>\r\n" + 
				"					<confidentialityCode code=\"R\" codeSystem=\"2.16.840.1.113883.5.25\"/>\r\n" + 
				"				</section>\r\n" + 
				"			</component>\r\n" + 
				"			<!-- Medications -->\r\n" + 
				"			<component>\r\n" + 
				"				<section>\r\n" + 
				"					<code code=\"10160-0\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"HISTORY OF MEDICATION USE\"/>\r\n" + 
				"					<title>Medications</title>\r\n" + 
				"					<text>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Basophils% 0.60 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Basophils# 0.08 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Eosinophils% 19.20 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Eosinophils# 2.58 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Haematocrit 30.5 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Haemoglobin 11.0 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Lymphocytes% 59.70 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Lymhocytes# 8.02 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) MCH 31.3 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) MCHC 36.1 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) MCV 86.9 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Monocytes% 6.50 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Monocytes# 0.87 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) MPV 8.9 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Neutrophils% 14.00 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Neutrophils# 1.89 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) Platelets 629 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) RDW 14.1 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) TRBC 3.51 </paragraph>\r\n" + 
				"						<paragraph>06/11/2019 12:00:11 Full Blood Count (FBC) WBC 13.4 </paragraph>\r\n" + 
				"					</text>\r\n" + 
				"					<confidentialityCode code=\"R\" codeSystem=\"2.16.840.1.113883.5.25\"/>\r\n" + 
				"				</section>\r\n" + 
				"			</component>\r\n" + 
				"			<!-- Results -->\r\n" + 
				"			<component>\r\n" + 
				"				<section>\r\n" + 
				"					<code code=\"30954-2\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"STUDIES SUMMARY\"/>\r\n" + 
				"					<title>Results</title>\r\n" + 
				"					<text>\r\n" + 
				"						<paragraph></paragraph>\r\n" + 
				"					</text>\r\n" + 
				"					<confidentialityCode code=\"R\" codeSystem=\"2.16.840.1.113883.5.25\"/>\r\n" + 
				"				</section>\r\n" + 
				"			</component>\r\n" + 
				"			<!-- Care Plan -->\r\n" + 
				"			<component>\r\n" + 
				"				<section>\r\n" + 
				"					<code code=\"18776-5\" codeSystem=\"2.16.840.1.113883.6.1\" codeSystemName=\"LOINC\" displayName=\"TREATMENT PLAN\"/>\r\n" + 
				"					<title>Care Plan</title>\r\n" + 
				"					<text>\r\n" + 
				"						<paragraph>1. Allow discharge</paragraph>\r\n" + 
				"						<paragraph>2. TCA on 4/11/19 at neurosurgical clinic and also for STO on same day</paragraph>\r\n" + 
				"						<paragraph>3. TCA at neuroclinic pm in 3 months</paragraph>\r\n" + 
				"						<paragraph>4. Chromosomal study 16/3/2020</paragraph>\r\n" + 
				"						<paragraph>5. TCA at MPC in 2 weeks to review condition of baby</paragraph>\r\n" + 
				"						<paragraph>7. For oral cefuroxime  for 1 week.</paragraph>\r\n" + 
				"					</text>\r\n" + 
				"					<confidentialityCode code=\"R\" codeSystem=\"2.16.840.1.113883.5.25\"/>\r\n" + 
				"				</section>\r\n" + 
				"			</component>\r\n" + 
				"		</structuredBody>\r\n" + 
				"	</component>\r\n" + 
				"</ClinicalDocument>";
		String xml2 = new String(Files.readAllBytes(Paths.get("C:\\dumparea\\MyHIX\\xmlCDAds.txt")));
		String inp = ConstructResponseMyhixDocumentDetail(xml2);
		
	}
	
	protected static String ConstructResponseMyhixDocumentDetail ( String xml) throws ParserConfigurationException, SAXException, IOException {
		xml = xml.contains("</paragraph>") ? xml.replace("</paragraph>", "|BREAK|</paragraph>") : xml;
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new InputSource(new StringReader(xml)));
        Element rootElement = document.getDocumentElement();

        //System.out.println("rootElement = "+rootElement.getElementsByTagName("component"));
        NodeList nodeComponent = rootElement.getElementsByTagName("component");
        //Node nodeStructureBody = nodeComponent.item(0);

        Element elementStructure = (Element) nodeComponent.item(0);

        NodeList nComponent = elementStructure.getElementsByTagName("component");
        JSONObject xmlJSONObj = XML.toJSONObject(xml);
        JSONObject json = new JSONObject();
        JSONArray array = new JSONArray();
        //JSONObject item = new JSONObject();
        
//        JSONObject xmlJSONObj = XML.toJSONObject(xml);
        System.out.println("line 372 :: "+xmlJSONObj);
        
        JSONObject pilot = xmlJSONObj.getJSONObject("ClinicalDocument");
        JSONObject component = pilot.getJSONObject("component");
        String titleXml = pilot.getString("title");
//        JSONObject titleXml = pilot.getJSONObject("title");
        JSONObject structuredBody = component.getJSONObject("structuredBody");
        JSONArray component1 = structuredBody.getJSONArray("component");
        
        for(int n = 0; n < component1.length(); n++)
		{
			JSONObject object = component1.getJSONObject(n);
			JSONObject object1 = object.getJSONObject("section");
//			String title = object1.getString("code");

			JSONObject code = object1.getJSONObject("code");
			String title = code.getString("displayName");
			
			JSONObject item = new JSONObject();
			item.put("title", ": " + title);
			item.put("titleSummary", titleXml);

			Object objectText = object1.get("text");
			if (objectText instanceof JSONObject) {
				JSONObject text = object1.getJSONObject("text");
				
				if (text.has("list")) {
					JSONObject list = text.getJSONObject("list");
					
					String value = list.getString("item");
					item.put("value", ": " + value);
					
				}else if(text.has("table")){
						Object table = text.get("table");
						if (table instanceof JSONArray) {
							// It's an array
							// interventionJsonArray = (JSONArray)intervention;
							JSONArray table1 = text.getJSONArray("table");
							for (int o = 0; o < table1.length(); o++) {
								JSONObject objectTable = table1.getJSONObject(o);
								JSONObject tr = objectTable.getJSONObject("tr");
		
								if (tr.has("td")) {
									Object objectTd = tr.get("td");
									if (objectTd instanceof JSONArray) {
										JSONArray td = tr.getJSONArray("td");
										String content = "";
										String paragraph = "";
										
										for (int p = 0; p < td.length(); p++) {
											JSONObject objectTable1 = td.getJSONObject(p);
											if (objectTable1.has("content")) {
												content = objectTable1.getString("content");
											}else if (objectTable1.has("paragraph")) {
												Object paragraphObj = objectTable1.get("paragraph");
												if(paragraphObj instanceof String){
													paragraph = objectTable1.getString("paragraph");	
												}	
											}
										}
										
										item = new JSONObject();
//										array = new JSONArray();
										item.put("title", ": " + title);
										item.put("value", ": " + content + paragraph);
										System.out.print( "test + " + content + paragraph);
										array.put(item);
									}
		
									if (objectTable.has("content")) {
										String content = objectTable.getString("content");
										String paragraph = objectTable.getString("paragraph");
		
										System.out.println(content);
										System.out.println(paragraph);
									}
								}
							}
						} else if (table instanceof JSONObject) {
							JSONObject table1 = text.getJSONObject("table");
							JSONObject tr = table1.getJSONObject("tr");
		
							if (tr.has("td")) {
								Object objectTd = tr.get("td");
								if (objectTd instanceof JSONArray) {
									JSONArray td = tr.getJSONArray("td");
		
									for (int o = 0; o < td.length(); o++) {
										JSONObject objectTable = td.getJSONObject(o);
										String paragraph = objectTable.getString("paragraph");
										item.put("value", ": " + paragraph);
									}
		
								} else if (objectTd instanceof JSONObject) {
		
									JSONObject td = tr.getJSONObject("td");
									String paragraph = td.getString("paragraph");
									item.put("value", ": " + paragraph);
		
								}
							}
						}
//					String value = "NIL";
//					item.put("value", ": " + value);
				}else if(text.equals("NIL")){
					String value = "NIL";
					item.put("value", ": " + value);
				}else{
					if (text.has("paragraph")) {
						String value = "";
						NodeList nList = rootElement.getElementsByTagName("component").item(n+1).getChildNodes();
						for(int temp = 0; temp < nList.getLength(); temp++) {
							Node node = nList.item(temp);
							if(node.getNodeType() == Node.ELEMENT_NODE) {
								Element eElement = (Element) node;
								value = eElement.getElementsByTagName("text").item(0).getTextContent().replace("\t", "");
								value = value.replace("\n","\n");
							}
						}
//						value = text.optString("paragraph");
						item.put("value", ": " + value);	
					}else if(text.has("text")){
						String value = text.getString("text");
						item.put("value", ": " + value);	
					}
				}	
			}else if(!objectText.equals("")){
				String value = objectText.toString();
				item.put("value", ": " + value);
			}else{
				String value = "NIL";
				item.put("value", ": " + value);
			}
			array.put(item);
		}
        
        json.put("myhixDocDetail", array);

        System.out.println("json = "+json.toString().replace("|BREAK|", "<br>"));
        
        return json.toString();
	}
}
