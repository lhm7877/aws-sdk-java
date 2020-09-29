/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/UntagResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UntagResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Timestream resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * A list of tags keys. Existing tags of the resource whose keys are members of this list will be removed from the
     * Timestream resource.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The Timestream resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceARN
     *        The Timestream resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The Timestream resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The Timestream resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The Timestream resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourceARN
     *        The Timestream resource that the tags will be removed from. This value is an Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * A list of tags keys. Existing tags of the resource whose keys are members of this list will be removed from the
     * Timestream resource.
     * </p>
     * 
     * @return A list of tags keys. Existing tags of the resource whose keys are members of this list will be removed
     *         from the Timestream resource.
     */

    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * A list of tags keys. Existing tags of the resource whose keys are members of this list will be removed from the
     * Timestream resource.
     * </p>
     * 
     * @param tagKeys
     *        A list of tags keys. Existing tags of the resource whose keys are members of this list will be removed
     *        from the Timestream resource.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * A list of tags keys. Existing tags of the resource whose keys are members of this list will be removed from the
     * Timestream resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagKeys(java.util.Collection)} or {@link #withTagKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagKeys
     *        A list of tags keys. Existing tags of the resource whose keys are members of this list will be removed
     *        from the Timestream resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags keys. Existing tags of the resource whose keys are members of this list will be removed from the
     * Timestream resource.
     * </p>
     * 
     * @param tagKeys
     *        A list of tags keys. Existing tags of the resource whose keys are members of this list will be removed
     *        from the Timestream resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UntagResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getTagKeys() != null)
            sb.append("TagKeys: ").append(getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UntagResourceRequest == false)
            return false;
        UntagResourceRequest other = (UntagResourceRequest) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public UntagResourceRequest clone() {
        return (UntagResourceRequest) super.clone();
    }

}
