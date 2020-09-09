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
package com.amazonaws.services.redshiftdataapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/ExecuteStatement" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecuteStatementResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier.
     * </p>
     */
    private String clusterIdentifier;
    /**
     * <p>
     * The date and time (UTC) the statement was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The name of the database.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The database user name.
     * </p>
     */
    private String dbUser;
    /**
     * <p>
     * The identifier of the statement to be run. This value is a universally unique identifier (UUID) generated by
     * Amazon Redshift Data API.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name or ARN of the secret that enables access to the database.
     * </p>
     */
    private String secretArn;

    /**
     * <p>
     * The cluster identifier.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier.
     */

    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier.
     * </p>
     * 
     * @return The cluster identifier.
     */

    public String getClusterIdentifier() {
        return this.clusterIdentifier;
    }

    /**
     * <p>
     * The cluster identifier.
     * </p>
     * 
     * @param clusterIdentifier
     *        The cluster identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withClusterIdentifier(String clusterIdentifier) {
        setClusterIdentifier(clusterIdentifier);
        return this;
    }

    /**
     * <p>
     * The date and time (UTC) the statement was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time (UTC) the statement was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time (UTC) the statement was created.
     * </p>
     * 
     * @return The date and time (UTC) the statement was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time (UTC) the statement was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time (UTC) the statement was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param database
     *        The name of the database.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @return The name of the database.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database.
     * </p>
     * 
     * @param database
     *        The name of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The database user name.
     * </p>
     * 
     * @param dbUser
     *        The database user name.
     */

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    /**
     * <p>
     * The database user name.
     * </p>
     * 
     * @return The database user name.
     */

    public String getDbUser() {
        return this.dbUser;
    }

    /**
     * <p>
     * The database user name.
     * </p>
     * 
     * @param dbUser
     *        The database user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withDbUser(String dbUser) {
        setDbUser(dbUser);
        return this;
    }

    /**
     * <p>
     * The identifier of the statement to be run. This value is a universally unique identifier (UUID) generated by
     * Amazon Redshift Data API.
     * </p>
     * 
     * @param id
     *        The identifier of the statement to be run. This value is a universally unique identifier (UUID) generated
     *        by Amazon Redshift Data API.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the statement to be run. This value is a universally unique identifier (UUID) generated by
     * Amazon Redshift Data API.
     * </p>
     * 
     * @return The identifier of the statement to be run. This value is a universally unique identifier (UUID) generated
     *         by Amazon Redshift Data API.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the statement to be run. This value is a universally unique identifier (UUID) generated by
     * Amazon Redshift Data API.
     * </p>
     * 
     * @param id
     *        The identifier of the statement to be run. This value is a universally unique identifier (UUID) generated
     *        by Amazon Redshift Data API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the database.
     */

    public void setSecretArn(String secretArn) {
        this.secretArn = secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database.
     * </p>
     * 
     * @return The name or ARN of the secret that enables access to the database.
     */

    public String getSecretArn() {
        return this.secretArn;
    }

    /**
     * <p>
     * The name or ARN of the secret that enables access to the database.
     * </p>
     * 
     * @param secretArn
     *        The name or ARN of the secret that enables access to the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecuteStatementResult withSecretArn(String secretArn) {
        setSecretArn(secretArn);
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: ").append(getClusterIdentifier()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getDbUser() != null)
            sb.append("DbUser: ").append(getDbUser()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getSecretArn() != null)
            sb.append("SecretArn: ").append(getSecretArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecuteStatementResult == false)
            return false;
        ExecuteStatementResult other = (ExecuteStatementResult) obj;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getDbUser() == null ^ this.getDbUser() == null)
            return false;
        if (other.getDbUser() != null && other.getDbUser().equals(this.getDbUser()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getSecretArn() == null ^ this.getSecretArn() == null)
            return false;
        if (other.getSecretArn() != null && other.getSecretArn().equals(this.getSecretArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getDbUser() == null) ? 0 : getDbUser().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getSecretArn() == null) ? 0 : getSecretArn().hashCode());
        return hashCode;
    }

    @Override
    public ExecuteStatementResult clone() {
        try {
            return (ExecuteStatementResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
