package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class _User, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Cli_UserDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _createdby;
    private String _createdon;
    private String _id;
    private Boolean admin;
    private String email;
    private Boolean forceChangePassword;
    private Boolean mpoxicona_vac;
    private String profile;
    private String team;
    private String username;

    public Cli_UserDTO() {
    }


    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public String get_clientId() {
        return _clientId;
    }
    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    /**
     * The attribute _createdby of _User. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of _User. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of _User. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of _User. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of _User. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of _User. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute admin of _User. It is of type Boolean. Cannot be null.
     */
    public Boolean getAdmin() {
        return admin;
    }
    /**
     * The attribute admin of _User. It is of type Boolean. Cannot be null.
     */
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    /**
     * The attribute email of _User. It is of type String. Max length: 255.Cannot be null.
     */
    public String getEmail() {
        return email;
    }
    /**
     * The attribute email of _User. It is of type String. Max length: 255.Cannot be null.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The attribute forceChangePassword of _User. It is of type Boolean. Cannot be null.
     */
    public Boolean getForceChangePassword() {
        return forceChangePassword;
    }
    /**
     * The attribute forceChangePassword of _User. It is of type Boolean. Cannot be null.
     */
    public void setForceChangePassword(Boolean forceChangePassword) {
        this.forceChangePassword = forceChangePassword;
    }

    /**
     * The attribute mpoxicona_vac of _User. It is of type Boolean.
     */
    public Boolean getMpoxicona_vac() {
        return mpoxicona_vac;
    }
    /**
     * The attribute mpoxicona_vac of _User. It is of type Boolean.
     */
    public void setMpoxicona_vac(Boolean mpoxicona_vac) {
        this.mpoxicona_vac = mpoxicona_vac;
    }

    /**
     * The attribute profile of _User. It is of type String. Domain: .}Max length: 255.Cannot be null.
     */
    public String getProfile() {
        return profile;
    }
    /**
     * The attribute profile of _User. It is of type String. Domain: .}Max length: 255.Cannot be null.
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * The attribute team of _User. It is of type String. Max length: 255.
     */
    public String getTeam() {
        return team;
    }
    /**
     * The attribute team of _User. It is of type String. Max length: 255.
     */
    public void setTeam(String team) {
        this.team = team;
    }

    /**
     * The attribute username of _User. It is of type String. Max length: 255.Cannot be null.
     */
    public String getUsername() {
        return username;
    }
    /**
     * The attribute username of _User. It is of type String. Max length: 255.Cannot be null.
     */
    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (_createdby != null) {
            joiner.add("_createdby: " + GraphQLRequestSerializer.getEntry(_createdby));
        }
        if (_createdon != null) {
            joiner.add("_createdon: " + GraphQLRequestSerializer.getEntry(_createdon));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (admin != null) {
            joiner.add("admin: " + GraphQLRequestSerializer.getEntry(admin));
        }
        if (email != null) {
            joiner.add("email: " + GraphQLRequestSerializer.getEntry(email));
        }
        if (forceChangePassword != null) {
            joiner.add("forceChangePassword: " + GraphQLRequestSerializer.getEntry(forceChangePassword));
        }
        if (mpoxicona_vac != null) {
            joiner.add("mpoxicona_vac: " + GraphQLRequestSerializer.getEntry(mpoxicona_vac));
        }
        if (profile != null) {
            joiner.add("profile: " + GraphQLRequestSerializer.getEntry(profile));
        }
        if (team != null) {
            joiner.add("team: " + GraphQLRequestSerializer.getEntry(team));
        }
        if (username != null) {
            joiner.add("username: " + GraphQLRequestSerializer.getEntry(username));
        }
        return joiner.toString();
    }

    public static Cli_UserDTO.Builder builder() {
        return new Cli_UserDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _createdby;
        private String _createdon;
        private String _id;
        private Boolean admin;
        private String email;
        private Boolean forceChangePassword;
        private Boolean mpoxicona_vac;
        private String profile;
        private String team;
        private String username;

        public Builder() {
        }

        /**
         * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
         */
        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        /**
         * The attribute _createdby of _User. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of _User. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of _User. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute admin of _User. It is of type Boolean. Cannot be null.
         */
        public Builder setAdmin(Boolean admin) {
            this.admin = admin;
            return this;
        }

        /**
         * The attribute email of _User. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * The attribute forceChangePassword of _User. It is of type Boolean. Cannot be null.
         */
        public Builder setForceChangePassword(Boolean forceChangePassword) {
            this.forceChangePassword = forceChangePassword;
            return this;
        }

        /**
         * The attribute mpoxicona_vac of _User. It is of type Boolean.
         */
        public Builder setMpoxicona_vac(Boolean mpoxicona_vac) {
            this.mpoxicona_vac = mpoxicona_vac;
            return this;
        }

        /**
         * The attribute profile of _User. It is of type String. Domain: .}Max length: 255.Cannot be null.
         */
        public Builder setProfile(String profile) {
            this.profile = profile;
            return this;
        }

        /**
         * The attribute team of _User. It is of type String. Max length: 255.
         */
        public Builder setTeam(String team) {
            this.team = team;
            return this;
        }

        /**
         * The attribute username of _User. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }


        public Cli_UserDTO build() {
            Cli_UserDTO result = new Cli_UserDTO();
            result.set_clientId(this._clientId);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.setAdmin(this.admin);
            result.setEmail(this.email);
            result.setForceChangePassword(this.forceChangePassword);
            result.setMpoxicona_vac(this.mpoxicona_vac);
            result.setProfile(this.profile);
            result.setTeam(this.team);
            result.setUsername(this.username);
            return result;
        }

    }
}
