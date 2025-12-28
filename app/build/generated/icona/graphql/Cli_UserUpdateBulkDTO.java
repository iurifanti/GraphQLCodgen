package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of class _User.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Cli_UserUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean admin;
    private String email;
    private Boolean forceChangePassword;
    private Boolean mpoxicona_vac;
    private String profile;
    private String team;
    private String username;

    public Cli_UserUpdateBulkDTO() {
    }


    public Boolean getAdmin() {
        return admin;
    }
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getForceChangePassword() {
        return forceChangePassword;
    }
    public void setForceChangePassword(Boolean forceChangePassword) {
        this.forceChangePassword = forceChangePassword;
    }

    public Boolean getMpoxicona_vac() {
        return mpoxicona_vac;
    }
    public void setMpoxicona_vac(Boolean mpoxicona_vac) {
        this.mpoxicona_vac = mpoxicona_vac;
    }

    public String getProfile() {
        return profile;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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

    public static Cli_UserUpdateBulkDTO.Builder builder() {
        return new Cli_UserUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private Boolean admin;
        private String email;
        private Boolean forceChangePassword;
        private Boolean mpoxicona_vac;
        private String profile;
        private String team;
        private String username;

        public Builder() {
        }

        public Builder setAdmin(Boolean admin) {
            this.admin = admin;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setForceChangePassword(Boolean forceChangePassword) {
            this.forceChangePassword = forceChangePassword;
            return this;
        }

        public Builder setMpoxicona_vac(Boolean mpoxicona_vac) {
            this.mpoxicona_vac = mpoxicona_vac;
            return this;
        }

        public Builder setProfile(String profile) {
            this.profile = profile;
            return this;
        }

        public Builder setTeam(String team) {
            this.team = team;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }


        public Cli_UserUpdateBulkDTO build() {
            Cli_UserUpdateBulkDTO result = new Cli_UserUpdateBulkDTO();
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
