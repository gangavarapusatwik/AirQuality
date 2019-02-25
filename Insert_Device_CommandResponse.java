/**
 * Insert_Device_CommandResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Insert_Device_CommandResponse  implements java.io.Serializable {
    private java.lang.Boolean insert_Device_CommandResult;

    public Insert_Device_CommandResponse() {
    }

    public Insert_Device_CommandResponse(
           java.lang.Boolean insert_Device_CommandResult) {
           this.insert_Device_CommandResult = insert_Device_CommandResult;
    }


    /**
     * Gets the insert_Device_CommandResult value for this Insert_Device_CommandResponse.
     * 
     * @return insert_Device_CommandResult
     */
    public java.lang.Boolean getInsert_Device_CommandResult() {
        return insert_Device_CommandResult;
    }


    /**
     * Sets the insert_Device_CommandResult value for this Insert_Device_CommandResponse.
     * 
     * @param insert_Device_CommandResult
     */
    public void setInsert_Device_CommandResult(java.lang.Boolean insert_Device_CommandResult) {
        this.insert_Device_CommandResult = insert_Device_CommandResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Insert_Device_CommandResponse)) return false;
        Insert_Device_CommandResponse other = (Insert_Device_CommandResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insert_Device_CommandResult==null && other.getInsert_Device_CommandResult()==null) || 
             (this.insert_Device_CommandResult!=null &&
              this.insert_Device_CommandResult.equals(other.getInsert_Device_CommandResult())));
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
        if (getInsert_Device_CommandResult() != null) {
            _hashCode += getInsert_Device_CommandResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Insert_Device_CommandResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Insert_Device_CommandResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insert_Device_CommandResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Insert_Device_CommandResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
