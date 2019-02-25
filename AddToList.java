/**
 * AddToList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddToList  implements java.io.Serializable {
    private java.lang.String androidID;

    private java.lang.String deviceID;

    private java.lang.String AQI;

    private java.lang.String AQI_Color;

    private java.lang.String AQL_Status;

    private java.lang.String lastTime;

    private java.lang.String deviceArea;

    private java.lang.String action;

    private java.lang.String sources;

    public AddToList() {
    }

    public AddToList(
           java.lang.String androidID,
           java.lang.String deviceID,
           java.lang.String AQI,
           java.lang.String AQI_Color,
           java.lang.String AQL_Status,
           java.lang.String lastTime,
           java.lang.String deviceArea,
           java.lang.String action,
           java.lang.String sources) {
           this.androidID = androidID;
           this.deviceID = deviceID;
           this.AQI = AQI;
           this.AQI_Color = AQI_Color;
           this.AQL_Status = AQL_Status;
           this.lastTime = lastTime;
           this.deviceArea = deviceArea;
           this.action = action;
           this.sources = sources;
    }


    /**
     * Gets the androidID value for this AddToList.
     * 
     * @return androidID
     */
    public java.lang.String getAndroidID() {
        return androidID;
    }


    /**
     * Sets the androidID value for this AddToList.
     * 
     * @param androidID
     */
    public void setAndroidID(java.lang.String androidID) {
        this.androidID = androidID;
    }


    /**
     * Gets the deviceID value for this AddToList.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this AddToList.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the AQI value for this AddToList.
     * 
     * @return AQI
     */
    public java.lang.String getAQI() {
        return AQI;
    }


    /**
     * Sets the AQI value for this AddToList.
     * 
     * @param AQI
     */
    public void setAQI(java.lang.String AQI) {
        this.AQI = AQI;
    }


    /**
     * Gets the AQI_Color value for this AddToList.
     * 
     * @return AQI_Color
     */
    public java.lang.String getAQI_Color() {
        return AQI_Color;
    }


    /**
     * Sets the AQI_Color value for this AddToList.
     * 
     * @param AQI_Color
     */
    public void setAQI_Color(java.lang.String AQI_Color) {
        this.AQI_Color = AQI_Color;
    }


    /**
     * Gets the AQL_Status value for this AddToList.
     * 
     * @return AQL_Status
     */
    public java.lang.String getAQL_Status() {
        return AQL_Status;
    }


    /**
     * Sets the AQL_Status value for this AddToList.
     * 
     * @param AQL_Status
     */
    public void setAQL_Status(java.lang.String AQL_Status) {
        this.AQL_Status = AQL_Status;
    }


    /**
     * Gets the lastTime value for this AddToList.
     * 
     * @return lastTime
     */
    public java.lang.String getLastTime() {
        return lastTime;
    }


    /**
     * Sets the lastTime value for this AddToList.
     * 
     * @param lastTime
     */
    public void setLastTime(java.lang.String lastTime) {
        this.lastTime = lastTime;
    }


    /**
     * Gets the deviceArea value for this AddToList.
     * 
     * @return deviceArea
     */
    public java.lang.String getDeviceArea() {
        return deviceArea;
    }


    /**
     * Sets the deviceArea value for this AddToList.
     * 
     * @param deviceArea
     */
    public void setDeviceArea(java.lang.String deviceArea) {
        this.deviceArea = deviceArea;
    }


    /**
     * Gets the action value for this AddToList.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this AddToList.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the sources value for this AddToList.
     * 
     * @return sources
     */
    public java.lang.String getSources() {
        return sources;
    }


    /**
     * Sets the sources value for this AddToList.
     * 
     * @param sources
     */
    public void setSources(java.lang.String sources) {
        this.sources = sources;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddToList)) return false;
        AddToList other = (AddToList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.androidID==null && other.getAndroidID()==null) || 
             (this.androidID!=null &&
              this.androidID.equals(other.getAndroidID()))) &&
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.AQI==null && other.getAQI()==null) || 
             (this.AQI!=null &&
              this.AQI.equals(other.getAQI()))) &&
            ((this.AQI_Color==null && other.getAQI_Color()==null) || 
             (this.AQI_Color!=null &&
              this.AQI_Color.equals(other.getAQI_Color()))) &&
            ((this.AQL_Status==null && other.getAQL_Status()==null) || 
             (this.AQL_Status!=null &&
              this.AQL_Status.equals(other.getAQL_Status()))) &&
            ((this.lastTime==null && other.getLastTime()==null) || 
             (this.lastTime!=null &&
              this.lastTime.equals(other.getLastTime()))) &&
            ((this.deviceArea==null && other.getDeviceArea()==null) || 
             (this.deviceArea!=null &&
              this.deviceArea.equals(other.getDeviceArea()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.sources==null && other.getSources()==null) || 
             (this.sources!=null &&
              this.sources.equals(other.getSources())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAndroidID() != null) {
            _hashCode += getAndroidID().hashCode();
        }
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getAQI() != null) {
            _hashCode += getAQI().hashCode();
        }
        if (getAQI_Color() != null) {
            _hashCode += getAQI_Color().hashCode();
        }
        if (getAQL_Status() != null) {
            _hashCode += getAQL_Status().hashCode();
        }
        if (getLastTime() != null) {
            _hashCode += getLastTime().hashCode();
        }
        if (getDeviceArea() != null) {
            _hashCode += getDeviceArea().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getSources() != null) {
            _hashCode += getSources().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddToList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddToList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("androidID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AndroidID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AQI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AQI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AQI_Color");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AQI_Color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AQL_Status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AQL_Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LastTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeviceArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sources");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Sources"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
