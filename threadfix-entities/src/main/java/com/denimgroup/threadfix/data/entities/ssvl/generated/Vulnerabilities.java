//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.31 at 01:08:03 PM CDT 
//


package com.denimgroup.threadfix.data.entities.ssvl.generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vulnerability" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Finding" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FindingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SurfaceLocation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DataFlowElement" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="LineText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="SourceFileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="LineNumber" type="{}PositiveNumber" />
 *                                     &lt;attribute name="ColumnNumber" type="{}PositiveNumber" />
 *                                     &lt;attribute name="Sequence" type="{}PositiveNumber" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="NativeID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="SourceFileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="IdentifiedTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="IssueID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CWE" type="{}CWE" />
 *                 &lt;attribute name="Severity" type="{}Severities" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="SpecVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ApplicationTag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExportTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vulnerability"
})
@XmlRootElement(name = "Vulnerabilities")
public class Vulnerabilities {

    @XmlElement(name = "Vulnerability")
    protected List<Vulnerabilities.Vulnerability> vulnerability;
    @XmlAttribute(name = "SpecVersion")
    protected String specVersion;
    @XmlAttribute(name = "ApplicationTag")
    protected String applicationTag;
    @XmlAttribute(name = "ExportTimestamp")
    protected String exportTimestamp;

    /**
     * Gets the value of the vulnerability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vulnerability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVulnerability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vulnerabilities.Vulnerability }
     * 
     * 
     */
    public List<Vulnerabilities.Vulnerability> getVulnerability() {
        if (vulnerability == null) {
            vulnerability = new ArrayList<Vulnerabilities.Vulnerability>();
        }
        return this.vulnerability;
    }

    /**
     * Gets the value of the specVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecVersion() {
        return specVersion;
    }

    /**
     * Sets the value of the specVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecVersion(String value) {
        this.specVersion = value;
    }

    /**
     * Gets the value of the applicationTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationTag() {
        return applicationTag;
    }

    /**
     * Sets the value of the applicationTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationTag(String value) {
        this.applicationTag = value;
    }

    /**
     * Gets the value of the exportTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportTimestamp() {
        return exportTimestamp;
    }

    /**
     * Sets the value of the exportTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportTimestamp(String value) {
        this.exportTimestamp = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Finding" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FindingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SurfaceLocation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DataFlowElement" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="LineText" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="SourceFileName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="LineNumber" type="{}PositiveNumber" />
     *                           &lt;attribute name="ColumnNumber" type="{}PositiveNumber" />
     *                           &lt;attribute name="Sequence" type="{}PositiveNumber" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="NativeID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="SourceFileName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IdentifiedTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="IssueID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CWE" type="{}CWE" />
     *       &lt;attribute name="Severity" type="{}Severities" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "shortDescription",
        "longDescription",
        "finding"
    })
    public static class Vulnerability {

        @XmlElement(name = "ShortDescription")
        protected String shortDescription;
        @XmlElement(name = "LongDescription")
        protected String longDescription;
        @XmlElement(name = "Finding")
        protected List<Vulnerabilities.Vulnerability.Finding> finding;
        @XmlAttribute(name = "IssueID")
        protected String issueID;
        @XmlAttribute(name = "CWE")
        protected Integer cwe;
        @XmlAttribute(name = "Severity")
        protected Severities severity;

        /**
         * Gets the value of the shortDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortDescription() {
            return shortDescription;
        }

        /**
         * Sets the value of the shortDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortDescription(String value) {
            this.shortDescription = value;
        }

        /**
         * Gets the value of the longDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongDescription() {
            return longDescription;
        }

        /**
         * Sets the value of the longDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongDescription(String value) {
            this.longDescription = value;
        }

        /**
         * Gets the value of the finding property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the finding property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFinding().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Vulnerabilities.Vulnerability.Finding }
         * 
         * 
         */
        public List<Vulnerabilities.Vulnerability.Finding> getFinding() {
            if (finding == null) {
                finding = new ArrayList<Vulnerabilities.Vulnerability.Finding>();
            }
            return this.finding;
        }

        /**
         * Gets the value of the issueID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIssueID() {
            return issueID;
        }

        /**
         * Sets the value of the issueID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIssueID(String value) {
            this.issueID = value;
        }

        /**
         * Gets the value of the cwe property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCWE() {
            return cwe;
        }

        /**
         * Sets the value of the cwe property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCWE(Integer value) {
            this.cwe = value;
        }

        /**
         * Gets the value of the severity property.
         * 
         * @return
         *     possible object is
         *     {@link Severities }
         *     
         */
        public Severities getSeverity() {
            return severity;
        }

        /**
         * Sets the value of the severity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Severities }
         *     
         */
        public void setSeverity(Severities value) {
            this.severity = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="FindingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SurfaceLocation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DataFlowElement" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="LineText" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="SourceFileName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="LineNumber" type="{}PositiveNumber" />
         *                 &lt;attribute name="ColumnNumber" type="{}PositiveNumber" />
         *                 &lt;attribute name="Sequence" type="{}PositiveNumber" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="NativeID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="SourceFileName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IdentifiedTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "findingDescription",
            "surfaceLocation",
            "dataFlowElement"
        })
        public static class Finding {

            @XmlElement(name = "FindingDescription")
            protected String findingDescription;
            @XmlElement(name = "SurfaceLocation")
            protected Vulnerabilities.Vulnerability.Finding.SurfaceLocation surfaceLocation;
            @XmlElement(name = "DataFlowElement")
            protected List<Vulnerabilities.Vulnerability.Finding.DataFlowElement> dataFlowElement;
            @XmlAttribute(name = "NativeID")
            protected String nativeID;
            @XmlAttribute(name = "Source")
            protected String source;
            @XmlAttribute(name = "SourceFileName")
            protected String sourceFileName;
            @XmlAttribute(name = "IdentifiedTimestamp")
            protected String identifiedTimestamp;

            /**
             * Gets the value of the findingDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFindingDescription() {
                return findingDescription;
            }

            /**
             * Sets the value of the findingDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFindingDescription(String value) {
                this.findingDescription = value;
            }

            /**
             * Gets the value of the surfaceLocation property.
             * 
             * @return
             *     possible object is
             *     {@link Vulnerabilities.Vulnerability.Finding.SurfaceLocation }
             *     
             */
            public Vulnerabilities.Vulnerability.Finding.SurfaceLocation getSurfaceLocation() {
                return surfaceLocation;
            }

            /**
             * Sets the value of the surfaceLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link Vulnerabilities.Vulnerability.Finding.SurfaceLocation }
             *     
             */
            public void setSurfaceLocation(Vulnerabilities.Vulnerability.Finding.SurfaceLocation value) {
                this.surfaceLocation = value;
            }

            /**
             * Gets the value of the dataFlowElement property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dataFlowElement property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDataFlowElement().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Vulnerabilities.Vulnerability.Finding.DataFlowElement }
             * 
             * 
             */
            public List<Vulnerabilities.Vulnerability.Finding.DataFlowElement> getDataFlowElement() {
                if (dataFlowElement == null) {
                    dataFlowElement = new ArrayList<Vulnerabilities.Vulnerability.Finding.DataFlowElement>();
                }
                return this.dataFlowElement;
            }

            /**
             * Gets the value of the nativeID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNativeID() {
                return nativeID;
            }

            /**
             * Sets the value of the nativeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNativeID(String value) {
                this.nativeID = value;
            }

            /**
             * Gets the value of the source property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Sets the value of the source property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

            /**
             * Gets the value of the sourceFileName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceFileName() {
                return sourceFileName;
            }

            /**
             * Sets the value of the sourceFileName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceFileName(String value) {
                this.sourceFileName = value;
            }

            /**
             * Gets the value of the identifiedTimestamp property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdentifiedTimestamp() {
                return identifiedTimestamp;
            }

            /**
             * Sets the value of the identifiedTimestamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdentifiedTimestamp(String value) {
                this.identifiedTimestamp = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="LineText" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="SourceFileName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="LineNumber" type="{}PositiveNumber" />
             *       &lt;attribute name="ColumnNumber" type="{}PositiveNumber" />
             *       &lt;attribute name="Sequence" type="{}PositiveNumber" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "lineText"
            })
            public static class DataFlowElement {

                @XmlElement(name = "LineText", required = true)
                protected String lineText;
                @XmlAttribute(name = "SourceFileName")
                protected String sourceFileName;
                @XmlAttribute(name = "LineNumber")
                protected BigInteger lineNumber;
                @XmlAttribute(name = "ColumnNumber")
                protected BigInteger columnNumber;
                @XmlAttribute(name = "Sequence")
                protected BigInteger sequence;

                /**
                 * Gets the value of the lineText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLineText() {
                    return lineText;
                }

                /**
                 * Sets the value of the lineText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLineText(String value) {
                    this.lineText = value;
                }

                /**
                 * Gets the value of the sourceFileName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSourceFileName() {
                    return sourceFileName;
                }

                /**
                 * Sets the value of the sourceFileName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSourceFileName(String value) {
                    this.sourceFileName = value;
                }

                /**
                 * Gets the value of the lineNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getLineNumber() {
                    return lineNumber;
                }

                /**
                 * Sets the value of the lineNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setLineNumber(BigInteger value) {
                    this.lineNumber = value;
                }

                /**
                 * Gets the value of the columnNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getColumnNumber() {
                    return columnNumber;
                }

                /**
                 * Sets the value of the columnNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setColumnNumber(BigInteger value) {
                    this.columnNumber = value;
                }

                /**
                 * Gets the value of the sequence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSequence() {
                    return sequence;
                }

                /**
                 * Sets the value of the sequence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSequence(BigInteger value) {
                    this.sequence = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class SurfaceLocation {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "url")
                protected String url;
                @XmlAttribute(name = "source")
                protected String source;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the url property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUrl() {
                    return url;
                }

                /**
                 * Sets the value of the url property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUrl(String value) {
                    this.url = value;
                }

                /**
                 * Gets the value of the source property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSource() {
                    return source;
                }

                /**
                 * Sets the value of the source property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSource(String value) {
                    this.source = value;
                }

            }

        }

    }

}
