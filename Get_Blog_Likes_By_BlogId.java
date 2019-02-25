/**
 * Get_Blog_Likes_By_BlogId.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Get_Blog_Likes_By_BlogId  implements java.io.Serializable {
    private java.lang.String blogId;

    public Get_Blog_Likes_By_BlogId() {
    }

    public Get_Blog_Likes_By_BlogId(
           java.lang.String blogId) {
           this.blogId = blogId;
    }


    /**
     * Gets the blogId value for this Get_Blog_Likes_By_BlogId.
     * 
     * @return blogId
     */
    public java.lang.String getBlogId() {
        return blogId;
    }


    /**
     * Sets the blogId value for this Get_Blog_Likes_By_BlogId.
     * 
     * @param blogId
     */
    public void setBlogId(java.lang.String blogId) {
        this.blogId = blogId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Get_Blog_Likes_By_BlogId)) return false;
        Get_Blog_Likes_By_BlogId other = (Get_Blog_Likes_By_BlogId) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blogId==null && other.getBlogId()==null) || 
             (this.blogId!=null &&
              this.blogId.equals(other.getBlogId())));
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
        if (getBlogId() != null) {
            _hashCode += getBlogId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Get_Blog_Likes_By_BlogId.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Get_Blog_Likes_By_BlogId"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blogId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BlogId"));
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
