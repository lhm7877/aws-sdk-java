/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListComplianceItems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListComplianceItemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more compliance filters. Use a filter to return a more specific list of results.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ComplianceStringFilter> filters;
    /**
     * <p>
     * The ID for the resources from which you want to get compliance information. Currently, you can only specify one
     * resource ID.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceIds;
    /**
     * <p>
     * The type of resource from which you want to get compliance information. Currently, the only supported resource
     * type is <code>ManagedInstance</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more compliance filters. Use a filter to return a more specific list of results.
     * </p>
     * 
     * @return One or more compliance filters. Use a filter to return a more specific list of results.
     */

    public java.util.List<ComplianceStringFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<ComplianceStringFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more compliance filters. Use a filter to return a more specific list of results.
     * </p>
     * 
     * @param filters
     *        One or more compliance filters. Use a filter to return a more specific list of results.
     */

    public void setFilters(java.util.Collection<ComplianceStringFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<ComplianceStringFilter>(filters);
    }

    /**
     * <p>
     * One or more compliance filters. Use a filter to return a more specific list of results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more compliance filters. Use a filter to return a more specific list of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceItemsRequest withFilters(ComplianceStringFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<ComplianceStringFilter>(filters.length));
        }
        for (ComplianceStringFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more compliance filters. Use a filter to return a more specific list of results.
     * </p>
     * 
     * @param filters
     *        One or more compliance filters. Use a filter to return a more specific list of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceItemsRequest withFilters(java.util.Collection<ComplianceStringFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The ID for the resources from which you want to get compliance information. Currently, you can only specify one
     * resource ID.
     * </p>
     * 
     * @return The ID for the resources from which you want to get compliance information. Currently, you can only
     *         specify one resource ID.
     */

    public java.util.List<String> getResourceIds() {
        if (resourceIds == null) {
            resourceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceIds;
    }

    /**
     * <p>
     * The ID for the resources from which you want to get compliance information. Currently, you can only specify one
     * resource ID.
     * </p>
     * 
     * @param resourceIds
     *        The ID for the resources from which you want to get compliance information. Currently, you can only
     *        specify one resource ID.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new com.amazonaws.internal.SdkInternalList<String>(resourceIds);
    }

    /**
     * <p>
     * The ID for the resources from which you want to get compliance information. Currently, you can only specify one
     * resource ID.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        The ID for the resources from which you want to get compliance information. Currently, you can only
     *        specify one resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceItemsRequest withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new com.amazonaws.internal.SdkInternalList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID for the resources from which you want to get compliance information. Currently, you can only specify one
     * resource ID.
     * </p>
     * 
     * @param resourceIds
     *        The ID for the resources from which you want to get compliance information. Currently, you can only
     *        specify one resource ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceItemsRequest withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The type of resource from which you want to get compliance information. Currently, the only supported resource
     * type is <code>ManagedInstance</code>.
     * </p>
     * 
     * @return The type of resource from which you want to get compliance information. Currently, the only supported
     *         resource type is <code>ManagedInstance</code>.
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * The type of resource from which you want to get compliance information. Currently, the only supported resource
     * type is <code>ManagedInstance</code>.
     * </p>
     * 
     * @param resourceTypes
     *        The type of resource from which you want to get compliance information. Currently, the only supported
     *        resource type is <code>ManagedInstance</code>.
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(resourceTypes);
    }

    /**
     * <p>
     * The type of resource from which you want to get compliance information. Currently, the only supported resource
     * type is <code>ManagedInstance</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The type of resource from which you want to get compliance information. Currently, the only supported
     *        resource type is <code>ManagedInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceItemsRequest withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The type of resource from which you want to get compliance information. Currently, the only supported resource
     * type is <code>ManagedInstance</code>.
     * </p>
     * 
     * @param resourceTypes
     *        The type of resource from which you want to get compliance information. Currently, the only supported
     *        resource type is <code>ManagedInstance</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceItemsRequest withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceItemsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListComplianceItemsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListComplianceItemsRequest == false)
            return false;
        ListComplianceItemsRequest other = (ListComplianceItemsRequest) obj;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListComplianceItemsRequest clone() {
        return (ListComplianceItemsRequest) super.clone();
    }

}