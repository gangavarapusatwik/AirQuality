/**
 * Get_Blog_Likes_By_BlogIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Get_Blog_Likes_By_BlogIdResponse  implements java.io.Serializable {
    private java.lang.String get_Blog_Likes_By_BlogIdResult;

    public Get_Blog_Likes_By_BlogIdResponse() {
    }

    public Get_Blog_Likes_By_BlogIdResponse(
           java.lang.String get_Blog_Likes_By_BlogIdResult) {
           this.get_Blog_Likes_By_BlogIdResult = get_Blog_Likes_By_BlogIdResult;
    }


    /**
     * Gets the get_Blog_Likes_By_BlogIdResult value for this Get_Blog_Likes_By_BlogIdResponse.
     * 
     * @return get_Blog_Likes_By_BlogIdResult
     */
    public java.lang.String getGet_Blog_Likes_By_BlogIdResult() {
        return get_Blog_Likes_By_BlogIdResult;
    }


    /**
     * Sets the get_Blog_Likes_By_BlogIdResult value for this Get_Blog_Likes_By_BlogIdResponse.
     * 
     * @param get_Blog_Likes_By_BlogIdResult
     */
    public void setGet_Blog_Likes_By_BlogIdResult(java.lang.String get_Blog_Likes_By_BlogIdResult) {
        this.get_Blog_Likes_By_BlogIdResult = get_Blog_Likes_By_BlogIdResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Blog_Likes_By_BlogIdResponse)) return false;
        Get_Blog_Likes_By_BlogIdResponse other = (Get_Blog_Likes_By_BlogIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.get_Blog_Likes_By_BlogIdResult==null && other.getGet_Blog_Likes_By_BlogIdResult()==null) || 
             (this.get_Blog_Likes_By_BlogIdResult!=null &&
              this.get_Blog_Likes_By_BlogIdResult.equals(other.getGet_Blog_Likes_By_BlogIdResult())));
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
        if (getGet_Blog_Likes_By_BlogIdResult() != null) {
            _hashCode += getGet_Blog_Likes_By_BlogIdResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Blog_Likes_By_BlogIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Blog_Likes_By_BlogIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("get_Blog_Likes_By_BlogIdResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Get_Blog_Likes_By_BlogIdResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
