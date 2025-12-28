package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type _User.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class Cli_UserFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private String _createdby___eq;
    private String _createdby___ne;
    private Boolean _createdby___null;
    private Boolean _createdby___not___null;
    private java.util.List<String> _createdby___in;
    private java.util.List<String> _createdby___not___in;
    private String _createdby___lt;
    private String _createdby___lte;
    private String _createdby___gt;
    private String _createdby___gte;
    private String _createdby___contains;
    private String _createdby___not___contains;
    private String _createdby___starts_with;
    private String _createdby___not___starts_with;
    private String _createdby___ends_with;
    private String _createdby___not___ends_with;
    private String _createdon___eq;
    private String _createdon___ne;
    private Boolean _createdon___null;
    private Boolean _createdon___not___null;
    private java.util.List<String> _createdon___in;
    private java.util.List<String> _createdon___not___in;
    private String _createdon___lt;
    private String _createdon___lte;
    private String _createdon___gt;
    private String _createdon___gte;
    private String _id___eq;
    private String _id___ne;
    private Boolean _id___null;
    private Boolean _id___not___null;
    private java.util.List<String> _id___in;
    private java.util.List<String> _id___not___in;
    private String _id___lt;
    private String _id___lte;
    private String _id___gt;
    private String _id___gte;
    private Boolean admin___eq;
    private Boolean admin___ne;
    private Boolean admin___null;
    private Boolean admin___not___null;
    private String email___eq;
    private String email___ne;
    private Boolean email___null;
    private Boolean email___not___null;
    private java.util.List<String> email___in;
    private java.util.List<String> email___not___in;
    private String email___lt;
    private String email___lte;
    private String email___gt;
    private String email___gte;
    private String email___contains;
    private String email___not___contains;
    private String email___starts_with;
    private String email___not___starts_with;
    private String email___ends_with;
    private String email___not___ends_with;
    private Boolean forceChangePassword___eq;
    private Boolean forceChangePassword___ne;
    private Boolean forceChangePassword___null;
    private Boolean forceChangePassword___not___null;
    private Boolean mpoxicona_vac___eq;
    private Boolean mpoxicona_vac___ne;
    private Boolean mpoxicona_vac___null;
    private Boolean mpoxicona_vac___not___null;
    private String profile___eq;
    private String profile___ne;
    private Boolean profile___null;
    private Boolean profile___not___null;
    private java.util.List<String> profile___in;
    private java.util.List<String> profile___not___in;
    private String profile___lt;
    private String profile___lte;
    private String profile___gt;
    private String profile___gte;
    private String profile___contains;
    private String profile___not___contains;
    private String profile___starts_with;
    private String profile___not___starts_with;
    private String profile___ends_with;
    private String profile___not___ends_with;
    private String team___eq;
    private String team___ne;
    private Boolean team___null;
    private Boolean team___not___null;
    private java.util.List<String> team___in;
    private java.util.List<String> team___not___in;
    private String team___lt;
    private String team___lte;
    private String team___gt;
    private String team___gte;
    private String team___contains;
    private String team___not___contains;
    private String team___starts_with;
    private String team___not___starts_with;
    private String team___ends_with;
    private String team___not___ends_with;
    private String username___eq;
    private String username___ne;
    private Boolean username___null;
    private Boolean username___not___null;
    private java.util.List<String> username___in;
    private java.util.List<String> username___not___in;
    private String username___lt;
    private String username___lte;
    private String username___gt;
    private String username___gte;
    private String username___contains;
    private String username___not___contains;
    private String username___starts_with;
    private String username___not___starts_with;
    private String username___ends_with;
    private String username___not___ends_with;
    private java.util.List<Cli_UserFilterDTO> AND;
    private java.util.List<Cli_UserFilterDTO> OR;
    private Cli_UserFilterDTO NOT;

    public Cli_UserFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public String get_createdby___eq() {
        return _createdby___eq;
    }
    public void set_createdby___eq(String _createdby___eq) {
        this._createdby___eq = _createdby___eq;
    }

    public String get_createdby___ne() {
        return _createdby___ne;
    }
    public void set_createdby___ne(String _createdby___ne) {
        this._createdby___ne = _createdby___ne;
    }

    public Boolean get_createdby___null() {
        return _createdby___null;
    }
    public void set_createdby___null(Boolean _createdby___null) {
        this._createdby___null = _createdby___null;
    }

    public Boolean get_createdby___not___null() {
        return _createdby___not___null;
    }
    public void set_createdby___not___null(Boolean _createdby___not___null) {
        this._createdby___not___null = _createdby___not___null;
    }

    public java.util.List<String> get_createdby___in() {
        return _createdby___in;
    }
    public void set_createdby___in(java.util.List<String> _createdby___in) {
        this._createdby___in = _createdby___in;
    }

    public java.util.List<String> get_createdby___not___in() {
        return _createdby___not___in;
    }
    public void set_createdby___not___in(java.util.List<String> _createdby___not___in) {
        this._createdby___not___in = _createdby___not___in;
    }

    public String get_createdby___lt() {
        return _createdby___lt;
    }
    public void set_createdby___lt(String _createdby___lt) {
        this._createdby___lt = _createdby___lt;
    }

    public String get_createdby___lte() {
        return _createdby___lte;
    }
    public void set_createdby___lte(String _createdby___lte) {
        this._createdby___lte = _createdby___lte;
    }

    public String get_createdby___gt() {
        return _createdby___gt;
    }
    public void set_createdby___gt(String _createdby___gt) {
        this._createdby___gt = _createdby___gt;
    }

    public String get_createdby___gte() {
        return _createdby___gte;
    }
    public void set_createdby___gte(String _createdby___gte) {
        this._createdby___gte = _createdby___gte;
    }

    public String get_createdby___contains() {
        return _createdby___contains;
    }
    public void set_createdby___contains(String _createdby___contains) {
        this._createdby___contains = _createdby___contains;
    }

    public String get_createdby___not___contains() {
        return _createdby___not___contains;
    }
    public void set_createdby___not___contains(String _createdby___not___contains) {
        this._createdby___not___contains = _createdby___not___contains;
    }

    public String get_createdby___starts_with() {
        return _createdby___starts_with;
    }
    public void set_createdby___starts_with(String _createdby___starts_with) {
        this._createdby___starts_with = _createdby___starts_with;
    }

    public String get_createdby___not___starts_with() {
        return _createdby___not___starts_with;
    }
    public void set_createdby___not___starts_with(String _createdby___not___starts_with) {
        this._createdby___not___starts_with = _createdby___not___starts_with;
    }

    public String get_createdby___ends_with() {
        return _createdby___ends_with;
    }
    public void set_createdby___ends_with(String _createdby___ends_with) {
        this._createdby___ends_with = _createdby___ends_with;
    }

    public String get_createdby___not___ends_with() {
        return _createdby___not___ends_with;
    }
    public void set_createdby___not___ends_with(String _createdby___not___ends_with) {
        this._createdby___not___ends_with = _createdby___not___ends_with;
    }

    public String get_createdon___eq() {
        return _createdon___eq;
    }
    public void set_createdon___eq(String _createdon___eq) {
        this._createdon___eq = _createdon___eq;
    }

    public String get_createdon___ne() {
        return _createdon___ne;
    }
    public void set_createdon___ne(String _createdon___ne) {
        this._createdon___ne = _createdon___ne;
    }

    public Boolean get_createdon___null() {
        return _createdon___null;
    }
    public void set_createdon___null(Boolean _createdon___null) {
        this._createdon___null = _createdon___null;
    }

    public Boolean get_createdon___not___null() {
        return _createdon___not___null;
    }
    public void set_createdon___not___null(Boolean _createdon___not___null) {
        this._createdon___not___null = _createdon___not___null;
    }

    public java.util.List<String> get_createdon___in() {
        return _createdon___in;
    }
    public void set_createdon___in(java.util.List<String> _createdon___in) {
        this._createdon___in = _createdon___in;
    }

    public java.util.List<String> get_createdon___not___in() {
        return _createdon___not___in;
    }
    public void set_createdon___not___in(java.util.List<String> _createdon___not___in) {
        this._createdon___not___in = _createdon___not___in;
    }

    public String get_createdon___lt() {
        return _createdon___lt;
    }
    public void set_createdon___lt(String _createdon___lt) {
        this._createdon___lt = _createdon___lt;
    }

    public String get_createdon___lte() {
        return _createdon___lte;
    }
    public void set_createdon___lte(String _createdon___lte) {
        this._createdon___lte = _createdon___lte;
    }

    public String get_createdon___gt() {
        return _createdon___gt;
    }
    public void set_createdon___gt(String _createdon___gt) {
        this._createdon___gt = _createdon___gt;
    }

    public String get_createdon___gte() {
        return _createdon___gte;
    }
    public void set_createdon___gte(String _createdon___gte) {
        this._createdon___gte = _createdon___gte;
    }

    public String get_id___eq() {
        return _id___eq;
    }
    public void set_id___eq(String _id___eq) {
        this._id___eq = _id___eq;
    }

    public String get_id___ne() {
        return _id___ne;
    }
    public void set_id___ne(String _id___ne) {
        this._id___ne = _id___ne;
    }

    public Boolean get_id___null() {
        return _id___null;
    }
    public void set_id___null(Boolean _id___null) {
        this._id___null = _id___null;
    }

    public Boolean get_id___not___null() {
        return _id___not___null;
    }
    public void set_id___not___null(Boolean _id___not___null) {
        this._id___not___null = _id___not___null;
    }

    public java.util.List<String> get_id___in() {
        return _id___in;
    }
    public void set_id___in(java.util.List<String> _id___in) {
        this._id___in = _id___in;
    }

    public java.util.List<String> get_id___not___in() {
        return _id___not___in;
    }
    public void set_id___not___in(java.util.List<String> _id___not___in) {
        this._id___not___in = _id___not___in;
    }

    public String get_id___lt() {
        return _id___lt;
    }
    public void set_id___lt(String _id___lt) {
        this._id___lt = _id___lt;
    }

    public String get_id___lte() {
        return _id___lte;
    }
    public void set_id___lte(String _id___lte) {
        this._id___lte = _id___lte;
    }

    public String get_id___gt() {
        return _id___gt;
    }
    public void set_id___gt(String _id___gt) {
        this._id___gt = _id___gt;
    }

    public String get_id___gte() {
        return _id___gte;
    }
    public void set_id___gte(String _id___gte) {
        this._id___gte = _id___gte;
    }

    public Boolean getAdmin___eq() {
        return admin___eq;
    }
    public void setAdmin___eq(Boolean admin___eq) {
        this.admin___eq = admin___eq;
    }

    public Boolean getAdmin___ne() {
        return admin___ne;
    }
    public void setAdmin___ne(Boolean admin___ne) {
        this.admin___ne = admin___ne;
    }

    public Boolean getAdmin___null() {
        return admin___null;
    }
    public void setAdmin___null(Boolean admin___null) {
        this.admin___null = admin___null;
    }

    public Boolean getAdmin___not___null() {
        return admin___not___null;
    }
    public void setAdmin___not___null(Boolean admin___not___null) {
        this.admin___not___null = admin___not___null;
    }

    public String getEmail___eq() {
        return email___eq;
    }
    public void setEmail___eq(String email___eq) {
        this.email___eq = email___eq;
    }

    public String getEmail___ne() {
        return email___ne;
    }
    public void setEmail___ne(String email___ne) {
        this.email___ne = email___ne;
    }

    public Boolean getEmail___null() {
        return email___null;
    }
    public void setEmail___null(Boolean email___null) {
        this.email___null = email___null;
    }

    public Boolean getEmail___not___null() {
        return email___not___null;
    }
    public void setEmail___not___null(Boolean email___not___null) {
        this.email___not___null = email___not___null;
    }

    public java.util.List<String> getEmail___in() {
        return email___in;
    }
    public void setEmail___in(java.util.List<String> email___in) {
        this.email___in = email___in;
    }

    public java.util.List<String> getEmail___not___in() {
        return email___not___in;
    }
    public void setEmail___not___in(java.util.List<String> email___not___in) {
        this.email___not___in = email___not___in;
    }

    public String getEmail___lt() {
        return email___lt;
    }
    public void setEmail___lt(String email___lt) {
        this.email___lt = email___lt;
    }

    public String getEmail___lte() {
        return email___lte;
    }
    public void setEmail___lte(String email___lte) {
        this.email___lte = email___lte;
    }

    public String getEmail___gt() {
        return email___gt;
    }
    public void setEmail___gt(String email___gt) {
        this.email___gt = email___gt;
    }

    public String getEmail___gte() {
        return email___gte;
    }
    public void setEmail___gte(String email___gte) {
        this.email___gte = email___gte;
    }

    public String getEmail___contains() {
        return email___contains;
    }
    public void setEmail___contains(String email___contains) {
        this.email___contains = email___contains;
    }

    public String getEmail___not___contains() {
        return email___not___contains;
    }
    public void setEmail___not___contains(String email___not___contains) {
        this.email___not___contains = email___not___contains;
    }

    public String getEmail___starts_with() {
        return email___starts_with;
    }
    public void setEmail___starts_with(String email___starts_with) {
        this.email___starts_with = email___starts_with;
    }

    public String getEmail___not___starts_with() {
        return email___not___starts_with;
    }
    public void setEmail___not___starts_with(String email___not___starts_with) {
        this.email___not___starts_with = email___not___starts_with;
    }

    public String getEmail___ends_with() {
        return email___ends_with;
    }
    public void setEmail___ends_with(String email___ends_with) {
        this.email___ends_with = email___ends_with;
    }

    public String getEmail___not___ends_with() {
        return email___not___ends_with;
    }
    public void setEmail___not___ends_with(String email___not___ends_with) {
        this.email___not___ends_with = email___not___ends_with;
    }

    public Boolean getForceChangePassword___eq() {
        return forceChangePassword___eq;
    }
    public void setForceChangePassword___eq(Boolean forceChangePassword___eq) {
        this.forceChangePassword___eq = forceChangePassword___eq;
    }

    public Boolean getForceChangePassword___ne() {
        return forceChangePassword___ne;
    }
    public void setForceChangePassword___ne(Boolean forceChangePassword___ne) {
        this.forceChangePassword___ne = forceChangePassword___ne;
    }

    public Boolean getForceChangePassword___null() {
        return forceChangePassword___null;
    }
    public void setForceChangePassword___null(Boolean forceChangePassword___null) {
        this.forceChangePassword___null = forceChangePassword___null;
    }

    public Boolean getForceChangePassword___not___null() {
        return forceChangePassword___not___null;
    }
    public void setForceChangePassword___not___null(Boolean forceChangePassword___not___null) {
        this.forceChangePassword___not___null = forceChangePassword___not___null;
    }

    public Boolean getMpoxicona_vac___eq() {
        return mpoxicona_vac___eq;
    }
    public void setMpoxicona_vac___eq(Boolean mpoxicona_vac___eq) {
        this.mpoxicona_vac___eq = mpoxicona_vac___eq;
    }

    public Boolean getMpoxicona_vac___ne() {
        return mpoxicona_vac___ne;
    }
    public void setMpoxicona_vac___ne(Boolean mpoxicona_vac___ne) {
        this.mpoxicona_vac___ne = mpoxicona_vac___ne;
    }

    public Boolean getMpoxicona_vac___null() {
        return mpoxicona_vac___null;
    }
    public void setMpoxicona_vac___null(Boolean mpoxicona_vac___null) {
        this.mpoxicona_vac___null = mpoxicona_vac___null;
    }

    public Boolean getMpoxicona_vac___not___null() {
        return mpoxicona_vac___not___null;
    }
    public void setMpoxicona_vac___not___null(Boolean mpoxicona_vac___not___null) {
        this.mpoxicona_vac___not___null = mpoxicona_vac___not___null;
    }

    public String getProfile___eq() {
        return profile___eq;
    }
    public void setProfile___eq(String profile___eq) {
        this.profile___eq = profile___eq;
    }

    public String getProfile___ne() {
        return profile___ne;
    }
    public void setProfile___ne(String profile___ne) {
        this.profile___ne = profile___ne;
    }

    public Boolean getProfile___null() {
        return profile___null;
    }
    public void setProfile___null(Boolean profile___null) {
        this.profile___null = profile___null;
    }

    public Boolean getProfile___not___null() {
        return profile___not___null;
    }
    public void setProfile___not___null(Boolean profile___not___null) {
        this.profile___not___null = profile___not___null;
    }

    public java.util.List<String> getProfile___in() {
        return profile___in;
    }
    public void setProfile___in(java.util.List<String> profile___in) {
        this.profile___in = profile___in;
    }

    public java.util.List<String> getProfile___not___in() {
        return profile___not___in;
    }
    public void setProfile___not___in(java.util.List<String> profile___not___in) {
        this.profile___not___in = profile___not___in;
    }

    public String getProfile___lt() {
        return profile___lt;
    }
    public void setProfile___lt(String profile___lt) {
        this.profile___lt = profile___lt;
    }

    public String getProfile___lte() {
        return profile___lte;
    }
    public void setProfile___lte(String profile___lte) {
        this.profile___lte = profile___lte;
    }

    public String getProfile___gt() {
        return profile___gt;
    }
    public void setProfile___gt(String profile___gt) {
        this.profile___gt = profile___gt;
    }

    public String getProfile___gte() {
        return profile___gte;
    }
    public void setProfile___gte(String profile___gte) {
        this.profile___gte = profile___gte;
    }

    public String getProfile___contains() {
        return profile___contains;
    }
    public void setProfile___contains(String profile___contains) {
        this.profile___contains = profile___contains;
    }

    public String getProfile___not___contains() {
        return profile___not___contains;
    }
    public void setProfile___not___contains(String profile___not___contains) {
        this.profile___not___contains = profile___not___contains;
    }

    public String getProfile___starts_with() {
        return profile___starts_with;
    }
    public void setProfile___starts_with(String profile___starts_with) {
        this.profile___starts_with = profile___starts_with;
    }

    public String getProfile___not___starts_with() {
        return profile___not___starts_with;
    }
    public void setProfile___not___starts_with(String profile___not___starts_with) {
        this.profile___not___starts_with = profile___not___starts_with;
    }

    public String getProfile___ends_with() {
        return profile___ends_with;
    }
    public void setProfile___ends_with(String profile___ends_with) {
        this.profile___ends_with = profile___ends_with;
    }

    public String getProfile___not___ends_with() {
        return profile___not___ends_with;
    }
    public void setProfile___not___ends_with(String profile___not___ends_with) {
        this.profile___not___ends_with = profile___not___ends_with;
    }

    public String getTeam___eq() {
        return team___eq;
    }
    public void setTeam___eq(String team___eq) {
        this.team___eq = team___eq;
    }

    public String getTeam___ne() {
        return team___ne;
    }
    public void setTeam___ne(String team___ne) {
        this.team___ne = team___ne;
    }

    public Boolean getTeam___null() {
        return team___null;
    }
    public void setTeam___null(Boolean team___null) {
        this.team___null = team___null;
    }

    public Boolean getTeam___not___null() {
        return team___not___null;
    }
    public void setTeam___not___null(Boolean team___not___null) {
        this.team___not___null = team___not___null;
    }

    public java.util.List<String> getTeam___in() {
        return team___in;
    }
    public void setTeam___in(java.util.List<String> team___in) {
        this.team___in = team___in;
    }

    public java.util.List<String> getTeam___not___in() {
        return team___not___in;
    }
    public void setTeam___not___in(java.util.List<String> team___not___in) {
        this.team___not___in = team___not___in;
    }

    public String getTeam___lt() {
        return team___lt;
    }
    public void setTeam___lt(String team___lt) {
        this.team___lt = team___lt;
    }

    public String getTeam___lte() {
        return team___lte;
    }
    public void setTeam___lte(String team___lte) {
        this.team___lte = team___lte;
    }

    public String getTeam___gt() {
        return team___gt;
    }
    public void setTeam___gt(String team___gt) {
        this.team___gt = team___gt;
    }

    public String getTeam___gte() {
        return team___gte;
    }
    public void setTeam___gte(String team___gte) {
        this.team___gte = team___gte;
    }

    public String getTeam___contains() {
        return team___contains;
    }
    public void setTeam___contains(String team___contains) {
        this.team___contains = team___contains;
    }

    public String getTeam___not___contains() {
        return team___not___contains;
    }
    public void setTeam___not___contains(String team___not___contains) {
        this.team___not___contains = team___not___contains;
    }

    public String getTeam___starts_with() {
        return team___starts_with;
    }
    public void setTeam___starts_with(String team___starts_with) {
        this.team___starts_with = team___starts_with;
    }

    public String getTeam___not___starts_with() {
        return team___not___starts_with;
    }
    public void setTeam___not___starts_with(String team___not___starts_with) {
        this.team___not___starts_with = team___not___starts_with;
    }

    public String getTeam___ends_with() {
        return team___ends_with;
    }
    public void setTeam___ends_with(String team___ends_with) {
        this.team___ends_with = team___ends_with;
    }

    public String getTeam___not___ends_with() {
        return team___not___ends_with;
    }
    public void setTeam___not___ends_with(String team___not___ends_with) {
        this.team___not___ends_with = team___not___ends_with;
    }

    public String getUsername___eq() {
        return username___eq;
    }
    public void setUsername___eq(String username___eq) {
        this.username___eq = username___eq;
    }

    public String getUsername___ne() {
        return username___ne;
    }
    public void setUsername___ne(String username___ne) {
        this.username___ne = username___ne;
    }

    public Boolean getUsername___null() {
        return username___null;
    }
    public void setUsername___null(Boolean username___null) {
        this.username___null = username___null;
    }

    public Boolean getUsername___not___null() {
        return username___not___null;
    }
    public void setUsername___not___null(Boolean username___not___null) {
        this.username___not___null = username___not___null;
    }

    public java.util.List<String> getUsername___in() {
        return username___in;
    }
    public void setUsername___in(java.util.List<String> username___in) {
        this.username___in = username___in;
    }

    public java.util.List<String> getUsername___not___in() {
        return username___not___in;
    }
    public void setUsername___not___in(java.util.List<String> username___not___in) {
        this.username___not___in = username___not___in;
    }

    public String getUsername___lt() {
        return username___lt;
    }
    public void setUsername___lt(String username___lt) {
        this.username___lt = username___lt;
    }

    public String getUsername___lte() {
        return username___lte;
    }
    public void setUsername___lte(String username___lte) {
        this.username___lte = username___lte;
    }

    public String getUsername___gt() {
        return username___gt;
    }
    public void setUsername___gt(String username___gt) {
        this.username___gt = username___gt;
    }

    public String getUsername___gte() {
        return username___gte;
    }
    public void setUsername___gte(String username___gte) {
        this.username___gte = username___gte;
    }

    public String getUsername___contains() {
        return username___contains;
    }
    public void setUsername___contains(String username___contains) {
        this.username___contains = username___contains;
    }

    public String getUsername___not___contains() {
        return username___not___contains;
    }
    public void setUsername___not___contains(String username___not___contains) {
        this.username___not___contains = username___not___contains;
    }

    public String getUsername___starts_with() {
        return username___starts_with;
    }
    public void setUsername___starts_with(String username___starts_with) {
        this.username___starts_with = username___starts_with;
    }

    public String getUsername___not___starts_with() {
        return username___not___starts_with;
    }
    public void setUsername___not___starts_with(String username___not___starts_with) {
        this.username___not___starts_with = username___not___starts_with;
    }

    public String getUsername___ends_with() {
        return username___ends_with;
    }
    public void setUsername___ends_with(String username___ends_with) {
        this.username___ends_with = username___ends_with;
    }

    public String getUsername___not___ends_with() {
        return username___not___ends_with;
    }
    public void setUsername___not___ends_with(String username___not___ends_with) {
        this.username___not___ends_with = username___not___ends_with;
    }

    public java.util.List<Cli_UserFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<Cli_UserFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<Cli_UserFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<Cli_UserFilterDTO> OR) {
        this.OR = OR;
    }

    public Cli_UserFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(Cli_UserFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (_createdby___eq != null) {
            joiner.add("_createdby___eq: " + GraphQLRequestSerializer.getEntry(_createdby___eq));
        }
        if (_createdby___ne != null) {
            joiner.add("_createdby___ne: " + GraphQLRequestSerializer.getEntry(_createdby___ne));
        }
        if (_createdby___null != null) {
            joiner.add("_createdby___null: " + GraphQLRequestSerializer.getEntry(_createdby___null));
        }
        if (_createdby___not___null != null) {
            joiner.add("_createdby___not___null: " + GraphQLRequestSerializer.getEntry(_createdby___not___null));
        }
        if (_createdby___in != null) {
            joiner.add("_createdby___in: " + GraphQLRequestSerializer.getEntry(_createdby___in));
        }
        if (_createdby___not___in != null) {
            joiner.add("_createdby___not___in: " + GraphQLRequestSerializer.getEntry(_createdby___not___in));
        }
        if (_createdby___lt != null) {
            joiner.add("_createdby___lt: " + GraphQLRequestSerializer.getEntry(_createdby___lt));
        }
        if (_createdby___lte != null) {
            joiner.add("_createdby___lte: " + GraphQLRequestSerializer.getEntry(_createdby___lte));
        }
        if (_createdby___gt != null) {
            joiner.add("_createdby___gt: " + GraphQLRequestSerializer.getEntry(_createdby___gt));
        }
        if (_createdby___gte != null) {
            joiner.add("_createdby___gte: " + GraphQLRequestSerializer.getEntry(_createdby___gte));
        }
        if (_createdby___contains != null) {
            joiner.add("_createdby___contains: " + GraphQLRequestSerializer.getEntry(_createdby___contains));
        }
        if (_createdby___not___contains != null) {
            joiner.add("_createdby___not___contains: " + GraphQLRequestSerializer.getEntry(_createdby___not___contains));
        }
        if (_createdby___starts_with != null) {
            joiner.add("_createdby___starts_with: " + GraphQLRequestSerializer.getEntry(_createdby___starts_with));
        }
        if (_createdby___not___starts_with != null) {
            joiner.add("_createdby___not___starts_with: " + GraphQLRequestSerializer.getEntry(_createdby___not___starts_with));
        }
        if (_createdby___ends_with != null) {
            joiner.add("_createdby___ends_with: " + GraphQLRequestSerializer.getEntry(_createdby___ends_with));
        }
        if (_createdby___not___ends_with != null) {
            joiner.add("_createdby___not___ends_with: " + GraphQLRequestSerializer.getEntry(_createdby___not___ends_with));
        }
        if (_createdon___eq != null) {
            joiner.add("_createdon___eq: " + GraphQLRequestSerializer.getEntry(_createdon___eq));
        }
        if (_createdon___ne != null) {
            joiner.add("_createdon___ne: " + GraphQLRequestSerializer.getEntry(_createdon___ne));
        }
        if (_createdon___null != null) {
            joiner.add("_createdon___null: " + GraphQLRequestSerializer.getEntry(_createdon___null));
        }
        if (_createdon___not___null != null) {
            joiner.add("_createdon___not___null: " + GraphQLRequestSerializer.getEntry(_createdon___not___null));
        }
        if (_createdon___in != null) {
            joiner.add("_createdon___in: " + GraphQLRequestSerializer.getEntry(_createdon___in));
        }
        if (_createdon___not___in != null) {
            joiner.add("_createdon___not___in: " + GraphQLRequestSerializer.getEntry(_createdon___not___in));
        }
        if (_createdon___lt != null) {
            joiner.add("_createdon___lt: " + GraphQLRequestSerializer.getEntry(_createdon___lt));
        }
        if (_createdon___lte != null) {
            joiner.add("_createdon___lte: " + GraphQLRequestSerializer.getEntry(_createdon___lte));
        }
        if (_createdon___gt != null) {
            joiner.add("_createdon___gt: " + GraphQLRequestSerializer.getEntry(_createdon___gt));
        }
        if (_createdon___gte != null) {
            joiner.add("_createdon___gte: " + GraphQLRequestSerializer.getEntry(_createdon___gte));
        }
        if (_id___eq != null) {
            joiner.add("_id___eq: " + GraphQLRequestSerializer.getEntry(_id___eq));
        }
        if (_id___ne != null) {
            joiner.add("_id___ne: " + GraphQLRequestSerializer.getEntry(_id___ne));
        }
        if (_id___null != null) {
            joiner.add("_id___null: " + GraphQLRequestSerializer.getEntry(_id___null));
        }
        if (_id___not___null != null) {
            joiner.add("_id___not___null: " + GraphQLRequestSerializer.getEntry(_id___not___null));
        }
        if (_id___in != null) {
            joiner.add("_id___in: " + GraphQLRequestSerializer.getEntry(_id___in));
        }
        if (_id___not___in != null) {
            joiner.add("_id___not___in: " + GraphQLRequestSerializer.getEntry(_id___not___in));
        }
        if (_id___lt != null) {
            joiner.add("_id___lt: " + GraphQLRequestSerializer.getEntry(_id___lt));
        }
        if (_id___lte != null) {
            joiner.add("_id___lte: " + GraphQLRequestSerializer.getEntry(_id___lte));
        }
        if (_id___gt != null) {
            joiner.add("_id___gt: " + GraphQLRequestSerializer.getEntry(_id___gt));
        }
        if (_id___gte != null) {
            joiner.add("_id___gte: " + GraphQLRequestSerializer.getEntry(_id___gte));
        }
        if (admin___eq != null) {
            joiner.add("admin___eq: " + GraphQLRequestSerializer.getEntry(admin___eq));
        }
        if (admin___ne != null) {
            joiner.add("admin___ne: " + GraphQLRequestSerializer.getEntry(admin___ne));
        }
        if (admin___null != null) {
            joiner.add("admin___null: " + GraphQLRequestSerializer.getEntry(admin___null));
        }
        if (admin___not___null != null) {
            joiner.add("admin___not___null: " + GraphQLRequestSerializer.getEntry(admin___not___null));
        }
        if (email___eq != null) {
            joiner.add("email___eq: " + GraphQLRequestSerializer.getEntry(email___eq));
        }
        if (email___ne != null) {
            joiner.add("email___ne: " + GraphQLRequestSerializer.getEntry(email___ne));
        }
        if (email___null != null) {
            joiner.add("email___null: " + GraphQLRequestSerializer.getEntry(email___null));
        }
        if (email___not___null != null) {
            joiner.add("email___not___null: " + GraphQLRequestSerializer.getEntry(email___not___null));
        }
        if (email___in != null) {
            joiner.add("email___in: " + GraphQLRequestSerializer.getEntry(email___in));
        }
        if (email___not___in != null) {
            joiner.add("email___not___in: " + GraphQLRequestSerializer.getEntry(email___not___in));
        }
        if (email___lt != null) {
            joiner.add("email___lt: " + GraphQLRequestSerializer.getEntry(email___lt));
        }
        if (email___lte != null) {
            joiner.add("email___lte: " + GraphQLRequestSerializer.getEntry(email___lte));
        }
        if (email___gt != null) {
            joiner.add("email___gt: " + GraphQLRequestSerializer.getEntry(email___gt));
        }
        if (email___gte != null) {
            joiner.add("email___gte: " + GraphQLRequestSerializer.getEntry(email___gte));
        }
        if (email___contains != null) {
            joiner.add("email___contains: " + GraphQLRequestSerializer.getEntry(email___contains));
        }
        if (email___not___contains != null) {
            joiner.add("email___not___contains: " + GraphQLRequestSerializer.getEntry(email___not___contains));
        }
        if (email___starts_with != null) {
            joiner.add("email___starts_with: " + GraphQLRequestSerializer.getEntry(email___starts_with));
        }
        if (email___not___starts_with != null) {
            joiner.add("email___not___starts_with: " + GraphQLRequestSerializer.getEntry(email___not___starts_with));
        }
        if (email___ends_with != null) {
            joiner.add("email___ends_with: " + GraphQLRequestSerializer.getEntry(email___ends_with));
        }
        if (email___not___ends_with != null) {
            joiner.add("email___not___ends_with: " + GraphQLRequestSerializer.getEntry(email___not___ends_with));
        }
        if (forceChangePassword___eq != null) {
            joiner.add("forceChangePassword___eq: " + GraphQLRequestSerializer.getEntry(forceChangePassword___eq));
        }
        if (forceChangePassword___ne != null) {
            joiner.add("forceChangePassword___ne: " + GraphQLRequestSerializer.getEntry(forceChangePassword___ne));
        }
        if (forceChangePassword___null != null) {
            joiner.add("forceChangePassword___null: " + GraphQLRequestSerializer.getEntry(forceChangePassword___null));
        }
        if (forceChangePassword___not___null != null) {
            joiner.add("forceChangePassword___not___null: " + GraphQLRequestSerializer.getEntry(forceChangePassword___not___null));
        }
        if (mpoxicona_vac___eq != null) {
            joiner.add("mpoxicona_vac___eq: " + GraphQLRequestSerializer.getEntry(mpoxicona_vac___eq));
        }
        if (mpoxicona_vac___ne != null) {
            joiner.add("mpoxicona_vac___ne: " + GraphQLRequestSerializer.getEntry(mpoxicona_vac___ne));
        }
        if (mpoxicona_vac___null != null) {
            joiner.add("mpoxicona_vac___null: " + GraphQLRequestSerializer.getEntry(mpoxicona_vac___null));
        }
        if (mpoxicona_vac___not___null != null) {
            joiner.add("mpoxicona_vac___not___null: " + GraphQLRequestSerializer.getEntry(mpoxicona_vac___not___null));
        }
        if (profile___eq != null) {
            joiner.add("profile___eq: " + GraphQLRequestSerializer.getEntry(profile___eq));
        }
        if (profile___ne != null) {
            joiner.add("profile___ne: " + GraphQLRequestSerializer.getEntry(profile___ne));
        }
        if (profile___null != null) {
            joiner.add("profile___null: " + GraphQLRequestSerializer.getEntry(profile___null));
        }
        if (profile___not___null != null) {
            joiner.add("profile___not___null: " + GraphQLRequestSerializer.getEntry(profile___not___null));
        }
        if (profile___in != null) {
            joiner.add("profile___in: " + GraphQLRequestSerializer.getEntry(profile___in));
        }
        if (profile___not___in != null) {
            joiner.add("profile___not___in: " + GraphQLRequestSerializer.getEntry(profile___not___in));
        }
        if (profile___lt != null) {
            joiner.add("profile___lt: " + GraphQLRequestSerializer.getEntry(profile___lt));
        }
        if (profile___lte != null) {
            joiner.add("profile___lte: " + GraphQLRequestSerializer.getEntry(profile___lte));
        }
        if (profile___gt != null) {
            joiner.add("profile___gt: " + GraphQLRequestSerializer.getEntry(profile___gt));
        }
        if (profile___gte != null) {
            joiner.add("profile___gte: " + GraphQLRequestSerializer.getEntry(profile___gte));
        }
        if (profile___contains != null) {
            joiner.add("profile___contains: " + GraphQLRequestSerializer.getEntry(profile___contains));
        }
        if (profile___not___contains != null) {
            joiner.add("profile___not___contains: " + GraphQLRequestSerializer.getEntry(profile___not___contains));
        }
        if (profile___starts_with != null) {
            joiner.add("profile___starts_with: " + GraphQLRequestSerializer.getEntry(profile___starts_with));
        }
        if (profile___not___starts_with != null) {
            joiner.add("profile___not___starts_with: " + GraphQLRequestSerializer.getEntry(profile___not___starts_with));
        }
        if (profile___ends_with != null) {
            joiner.add("profile___ends_with: " + GraphQLRequestSerializer.getEntry(profile___ends_with));
        }
        if (profile___not___ends_with != null) {
            joiner.add("profile___not___ends_with: " + GraphQLRequestSerializer.getEntry(profile___not___ends_with));
        }
        if (team___eq != null) {
            joiner.add("team___eq: " + GraphQLRequestSerializer.getEntry(team___eq));
        }
        if (team___ne != null) {
            joiner.add("team___ne: " + GraphQLRequestSerializer.getEntry(team___ne));
        }
        if (team___null != null) {
            joiner.add("team___null: " + GraphQLRequestSerializer.getEntry(team___null));
        }
        if (team___not___null != null) {
            joiner.add("team___not___null: " + GraphQLRequestSerializer.getEntry(team___not___null));
        }
        if (team___in != null) {
            joiner.add("team___in: " + GraphQLRequestSerializer.getEntry(team___in));
        }
        if (team___not___in != null) {
            joiner.add("team___not___in: " + GraphQLRequestSerializer.getEntry(team___not___in));
        }
        if (team___lt != null) {
            joiner.add("team___lt: " + GraphQLRequestSerializer.getEntry(team___lt));
        }
        if (team___lte != null) {
            joiner.add("team___lte: " + GraphQLRequestSerializer.getEntry(team___lte));
        }
        if (team___gt != null) {
            joiner.add("team___gt: " + GraphQLRequestSerializer.getEntry(team___gt));
        }
        if (team___gte != null) {
            joiner.add("team___gte: " + GraphQLRequestSerializer.getEntry(team___gte));
        }
        if (team___contains != null) {
            joiner.add("team___contains: " + GraphQLRequestSerializer.getEntry(team___contains));
        }
        if (team___not___contains != null) {
            joiner.add("team___not___contains: " + GraphQLRequestSerializer.getEntry(team___not___contains));
        }
        if (team___starts_with != null) {
            joiner.add("team___starts_with: " + GraphQLRequestSerializer.getEntry(team___starts_with));
        }
        if (team___not___starts_with != null) {
            joiner.add("team___not___starts_with: " + GraphQLRequestSerializer.getEntry(team___not___starts_with));
        }
        if (team___ends_with != null) {
            joiner.add("team___ends_with: " + GraphQLRequestSerializer.getEntry(team___ends_with));
        }
        if (team___not___ends_with != null) {
            joiner.add("team___not___ends_with: " + GraphQLRequestSerializer.getEntry(team___not___ends_with));
        }
        if (username___eq != null) {
            joiner.add("username___eq: " + GraphQLRequestSerializer.getEntry(username___eq));
        }
        if (username___ne != null) {
            joiner.add("username___ne: " + GraphQLRequestSerializer.getEntry(username___ne));
        }
        if (username___null != null) {
            joiner.add("username___null: " + GraphQLRequestSerializer.getEntry(username___null));
        }
        if (username___not___null != null) {
            joiner.add("username___not___null: " + GraphQLRequestSerializer.getEntry(username___not___null));
        }
        if (username___in != null) {
            joiner.add("username___in: " + GraphQLRequestSerializer.getEntry(username___in));
        }
        if (username___not___in != null) {
            joiner.add("username___not___in: " + GraphQLRequestSerializer.getEntry(username___not___in));
        }
        if (username___lt != null) {
            joiner.add("username___lt: " + GraphQLRequestSerializer.getEntry(username___lt));
        }
        if (username___lte != null) {
            joiner.add("username___lte: " + GraphQLRequestSerializer.getEntry(username___lte));
        }
        if (username___gt != null) {
            joiner.add("username___gt: " + GraphQLRequestSerializer.getEntry(username___gt));
        }
        if (username___gte != null) {
            joiner.add("username___gte: " + GraphQLRequestSerializer.getEntry(username___gte));
        }
        if (username___contains != null) {
            joiner.add("username___contains: " + GraphQLRequestSerializer.getEntry(username___contains));
        }
        if (username___not___contains != null) {
            joiner.add("username___not___contains: " + GraphQLRequestSerializer.getEntry(username___not___contains));
        }
        if (username___starts_with != null) {
            joiner.add("username___starts_with: " + GraphQLRequestSerializer.getEntry(username___starts_with));
        }
        if (username___not___starts_with != null) {
            joiner.add("username___not___starts_with: " + GraphQLRequestSerializer.getEntry(username___not___starts_with));
        }
        if (username___ends_with != null) {
            joiner.add("username___ends_with: " + GraphQLRequestSerializer.getEntry(username___ends_with));
        }
        if (username___not___ends_with != null) {
            joiner.add("username___not___ends_with: " + GraphQLRequestSerializer.getEntry(username___not___ends_with));
        }
        if (AND != null) {
            joiner.add("AND: " + GraphQLRequestSerializer.getEntry(AND));
        }
        if (OR != null) {
            joiner.add("OR: " + GraphQLRequestSerializer.getEntry(OR));
        }
        if (NOT != null) {
            joiner.add("NOT: " + GraphQLRequestSerializer.getEntry(NOT));
        }
        return joiner.toString();
    }

    public static Cli_UserFilterDTO.Builder builder() {
        return new Cli_UserFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private String _createdby___eq;
        private String _createdby___ne;
        private Boolean _createdby___null;
        private Boolean _createdby___not___null;
        private java.util.List<String> _createdby___in;
        private java.util.List<String> _createdby___not___in;
        private String _createdby___lt;
        private String _createdby___lte;
        private String _createdby___gt;
        private String _createdby___gte;
        private String _createdby___contains;
        private String _createdby___not___contains;
        private String _createdby___starts_with;
        private String _createdby___not___starts_with;
        private String _createdby___ends_with;
        private String _createdby___not___ends_with;
        private String _createdon___eq;
        private String _createdon___ne;
        private Boolean _createdon___null;
        private Boolean _createdon___not___null;
        private java.util.List<String> _createdon___in;
        private java.util.List<String> _createdon___not___in;
        private String _createdon___lt;
        private String _createdon___lte;
        private String _createdon___gt;
        private String _createdon___gte;
        private String _id___eq;
        private String _id___ne;
        private Boolean _id___null;
        private Boolean _id___not___null;
        private java.util.List<String> _id___in;
        private java.util.List<String> _id___not___in;
        private String _id___lt;
        private String _id___lte;
        private String _id___gt;
        private String _id___gte;
        private Boolean admin___eq;
        private Boolean admin___ne;
        private Boolean admin___null;
        private Boolean admin___not___null;
        private String email___eq;
        private String email___ne;
        private Boolean email___null;
        private Boolean email___not___null;
        private java.util.List<String> email___in;
        private java.util.List<String> email___not___in;
        private String email___lt;
        private String email___lte;
        private String email___gt;
        private String email___gte;
        private String email___contains;
        private String email___not___contains;
        private String email___starts_with;
        private String email___not___starts_with;
        private String email___ends_with;
        private String email___not___ends_with;
        private Boolean forceChangePassword___eq;
        private Boolean forceChangePassword___ne;
        private Boolean forceChangePassword___null;
        private Boolean forceChangePassword___not___null;
        private Boolean mpoxicona_vac___eq;
        private Boolean mpoxicona_vac___ne;
        private Boolean mpoxicona_vac___null;
        private Boolean mpoxicona_vac___not___null;
        private String profile___eq;
        private String profile___ne;
        private Boolean profile___null;
        private Boolean profile___not___null;
        private java.util.List<String> profile___in;
        private java.util.List<String> profile___not___in;
        private String profile___lt;
        private String profile___lte;
        private String profile___gt;
        private String profile___gte;
        private String profile___contains;
        private String profile___not___contains;
        private String profile___starts_with;
        private String profile___not___starts_with;
        private String profile___ends_with;
        private String profile___not___ends_with;
        private String team___eq;
        private String team___ne;
        private Boolean team___null;
        private Boolean team___not___null;
        private java.util.List<String> team___in;
        private java.util.List<String> team___not___in;
        private String team___lt;
        private String team___lte;
        private String team___gt;
        private String team___gte;
        private String team___contains;
        private String team___not___contains;
        private String team___starts_with;
        private String team___not___starts_with;
        private String team___ends_with;
        private String team___not___ends_with;
        private String username___eq;
        private String username___ne;
        private Boolean username___null;
        private Boolean username___not___null;
        private java.util.List<String> username___in;
        private java.util.List<String> username___not___in;
        private String username___lt;
        private String username___lte;
        private String username___gt;
        private String username___gte;
        private String username___contains;
        private String username___not___contains;
        private String username___starts_with;
        private String username___not___starts_with;
        private String username___ends_with;
        private String username___not___ends_with;
        private java.util.List<Cli_UserFilterDTO> AND;
        private java.util.List<Cli_UserFilterDTO> OR;
        private Cli_UserFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder set_createdby___eq(String _createdby___eq) {
            this._createdby___eq = _createdby___eq;
            return this;
        }

        public Builder set_createdby___ne(String _createdby___ne) {
            this._createdby___ne = _createdby___ne;
            return this;
        }

        public Builder set_createdby___null(Boolean _createdby___null) {
            this._createdby___null = _createdby___null;
            return this;
        }

        public Builder set_createdby___not___null(Boolean _createdby___not___null) {
            this._createdby___not___null = _createdby___not___null;
            return this;
        }

        public Builder set_createdby___in(java.util.List<String> _createdby___in) {
            this._createdby___in = _createdby___in;
            return this;
        }

        public Builder set_createdby___not___in(java.util.List<String> _createdby___not___in) {
            this._createdby___not___in = _createdby___not___in;
            return this;
        }

        public Builder set_createdby___lt(String _createdby___lt) {
            this._createdby___lt = _createdby___lt;
            return this;
        }

        public Builder set_createdby___lte(String _createdby___lte) {
            this._createdby___lte = _createdby___lte;
            return this;
        }

        public Builder set_createdby___gt(String _createdby___gt) {
            this._createdby___gt = _createdby___gt;
            return this;
        }

        public Builder set_createdby___gte(String _createdby___gte) {
            this._createdby___gte = _createdby___gte;
            return this;
        }

        public Builder set_createdby___contains(String _createdby___contains) {
            this._createdby___contains = _createdby___contains;
            return this;
        }

        public Builder set_createdby___not___contains(String _createdby___not___contains) {
            this._createdby___not___contains = _createdby___not___contains;
            return this;
        }

        public Builder set_createdby___starts_with(String _createdby___starts_with) {
            this._createdby___starts_with = _createdby___starts_with;
            return this;
        }

        public Builder set_createdby___not___starts_with(String _createdby___not___starts_with) {
            this._createdby___not___starts_with = _createdby___not___starts_with;
            return this;
        }

        public Builder set_createdby___ends_with(String _createdby___ends_with) {
            this._createdby___ends_with = _createdby___ends_with;
            return this;
        }

        public Builder set_createdby___not___ends_with(String _createdby___not___ends_with) {
            this._createdby___not___ends_with = _createdby___not___ends_with;
            return this;
        }

        public Builder set_createdon___eq(String _createdon___eq) {
            this._createdon___eq = _createdon___eq;
            return this;
        }

        public Builder set_createdon___ne(String _createdon___ne) {
            this._createdon___ne = _createdon___ne;
            return this;
        }

        public Builder set_createdon___null(Boolean _createdon___null) {
            this._createdon___null = _createdon___null;
            return this;
        }

        public Builder set_createdon___not___null(Boolean _createdon___not___null) {
            this._createdon___not___null = _createdon___not___null;
            return this;
        }

        public Builder set_createdon___in(java.util.List<String> _createdon___in) {
            this._createdon___in = _createdon___in;
            return this;
        }

        public Builder set_createdon___not___in(java.util.List<String> _createdon___not___in) {
            this._createdon___not___in = _createdon___not___in;
            return this;
        }

        public Builder set_createdon___lt(String _createdon___lt) {
            this._createdon___lt = _createdon___lt;
            return this;
        }

        public Builder set_createdon___lte(String _createdon___lte) {
            this._createdon___lte = _createdon___lte;
            return this;
        }

        public Builder set_createdon___gt(String _createdon___gt) {
            this._createdon___gt = _createdon___gt;
            return this;
        }

        public Builder set_createdon___gte(String _createdon___gte) {
            this._createdon___gte = _createdon___gte;
            return this;
        }

        public Builder set_id___eq(String _id___eq) {
            this._id___eq = _id___eq;
            return this;
        }

        public Builder set_id___ne(String _id___ne) {
            this._id___ne = _id___ne;
            return this;
        }

        public Builder set_id___null(Boolean _id___null) {
            this._id___null = _id___null;
            return this;
        }

        public Builder set_id___not___null(Boolean _id___not___null) {
            this._id___not___null = _id___not___null;
            return this;
        }

        public Builder set_id___in(java.util.List<String> _id___in) {
            this._id___in = _id___in;
            return this;
        }

        public Builder set_id___not___in(java.util.List<String> _id___not___in) {
            this._id___not___in = _id___not___in;
            return this;
        }

        public Builder set_id___lt(String _id___lt) {
            this._id___lt = _id___lt;
            return this;
        }

        public Builder set_id___lte(String _id___lte) {
            this._id___lte = _id___lte;
            return this;
        }

        public Builder set_id___gt(String _id___gt) {
            this._id___gt = _id___gt;
            return this;
        }

        public Builder set_id___gte(String _id___gte) {
            this._id___gte = _id___gte;
            return this;
        }

        public Builder setAdmin___eq(Boolean admin___eq) {
            this.admin___eq = admin___eq;
            return this;
        }

        public Builder setAdmin___ne(Boolean admin___ne) {
            this.admin___ne = admin___ne;
            return this;
        }

        public Builder setAdmin___null(Boolean admin___null) {
            this.admin___null = admin___null;
            return this;
        }

        public Builder setAdmin___not___null(Boolean admin___not___null) {
            this.admin___not___null = admin___not___null;
            return this;
        }

        public Builder setEmail___eq(String email___eq) {
            this.email___eq = email___eq;
            return this;
        }

        public Builder setEmail___ne(String email___ne) {
            this.email___ne = email___ne;
            return this;
        }

        public Builder setEmail___null(Boolean email___null) {
            this.email___null = email___null;
            return this;
        }

        public Builder setEmail___not___null(Boolean email___not___null) {
            this.email___not___null = email___not___null;
            return this;
        }

        public Builder setEmail___in(java.util.List<String> email___in) {
            this.email___in = email___in;
            return this;
        }

        public Builder setEmail___not___in(java.util.List<String> email___not___in) {
            this.email___not___in = email___not___in;
            return this;
        }

        public Builder setEmail___lt(String email___lt) {
            this.email___lt = email___lt;
            return this;
        }

        public Builder setEmail___lte(String email___lte) {
            this.email___lte = email___lte;
            return this;
        }

        public Builder setEmail___gt(String email___gt) {
            this.email___gt = email___gt;
            return this;
        }

        public Builder setEmail___gte(String email___gte) {
            this.email___gte = email___gte;
            return this;
        }

        public Builder setEmail___contains(String email___contains) {
            this.email___contains = email___contains;
            return this;
        }

        public Builder setEmail___not___contains(String email___not___contains) {
            this.email___not___contains = email___not___contains;
            return this;
        }

        public Builder setEmail___starts_with(String email___starts_with) {
            this.email___starts_with = email___starts_with;
            return this;
        }

        public Builder setEmail___not___starts_with(String email___not___starts_with) {
            this.email___not___starts_with = email___not___starts_with;
            return this;
        }

        public Builder setEmail___ends_with(String email___ends_with) {
            this.email___ends_with = email___ends_with;
            return this;
        }

        public Builder setEmail___not___ends_with(String email___not___ends_with) {
            this.email___not___ends_with = email___not___ends_with;
            return this;
        }

        public Builder setForceChangePassword___eq(Boolean forceChangePassword___eq) {
            this.forceChangePassword___eq = forceChangePassword___eq;
            return this;
        }

        public Builder setForceChangePassword___ne(Boolean forceChangePassword___ne) {
            this.forceChangePassword___ne = forceChangePassword___ne;
            return this;
        }

        public Builder setForceChangePassword___null(Boolean forceChangePassword___null) {
            this.forceChangePassword___null = forceChangePassword___null;
            return this;
        }

        public Builder setForceChangePassword___not___null(Boolean forceChangePassword___not___null) {
            this.forceChangePassword___not___null = forceChangePassword___not___null;
            return this;
        }

        public Builder setMpoxicona_vac___eq(Boolean mpoxicona_vac___eq) {
            this.mpoxicona_vac___eq = mpoxicona_vac___eq;
            return this;
        }

        public Builder setMpoxicona_vac___ne(Boolean mpoxicona_vac___ne) {
            this.mpoxicona_vac___ne = mpoxicona_vac___ne;
            return this;
        }

        public Builder setMpoxicona_vac___null(Boolean mpoxicona_vac___null) {
            this.mpoxicona_vac___null = mpoxicona_vac___null;
            return this;
        }

        public Builder setMpoxicona_vac___not___null(Boolean mpoxicona_vac___not___null) {
            this.mpoxicona_vac___not___null = mpoxicona_vac___not___null;
            return this;
        }

        public Builder setProfile___eq(String profile___eq) {
            this.profile___eq = profile___eq;
            return this;
        }

        public Builder setProfile___ne(String profile___ne) {
            this.profile___ne = profile___ne;
            return this;
        }

        public Builder setProfile___null(Boolean profile___null) {
            this.profile___null = profile___null;
            return this;
        }

        public Builder setProfile___not___null(Boolean profile___not___null) {
            this.profile___not___null = profile___not___null;
            return this;
        }

        public Builder setProfile___in(java.util.List<String> profile___in) {
            this.profile___in = profile___in;
            return this;
        }

        public Builder setProfile___not___in(java.util.List<String> profile___not___in) {
            this.profile___not___in = profile___not___in;
            return this;
        }

        public Builder setProfile___lt(String profile___lt) {
            this.profile___lt = profile___lt;
            return this;
        }

        public Builder setProfile___lte(String profile___lte) {
            this.profile___lte = profile___lte;
            return this;
        }

        public Builder setProfile___gt(String profile___gt) {
            this.profile___gt = profile___gt;
            return this;
        }

        public Builder setProfile___gte(String profile___gte) {
            this.profile___gte = profile___gte;
            return this;
        }

        public Builder setProfile___contains(String profile___contains) {
            this.profile___contains = profile___contains;
            return this;
        }

        public Builder setProfile___not___contains(String profile___not___contains) {
            this.profile___not___contains = profile___not___contains;
            return this;
        }

        public Builder setProfile___starts_with(String profile___starts_with) {
            this.profile___starts_with = profile___starts_with;
            return this;
        }

        public Builder setProfile___not___starts_with(String profile___not___starts_with) {
            this.profile___not___starts_with = profile___not___starts_with;
            return this;
        }

        public Builder setProfile___ends_with(String profile___ends_with) {
            this.profile___ends_with = profile___ends_with;
            return this;
        }

        public Builder setProfile___not___ends_with(String profile___not___ends_with) {
            this.profile___not___ends_with = profile___not___ends_with;
            return this;
        }

        public Builder setTeam___eq(String team___eq) {
            this.team___eq = team___eq;
            return this;
        }

        public Builder setTeam___ne(String team___ne) {
            this.team___ne = team___ne;
            return this;
        }

        public Builder setTeam___null(Boolean team___null) {
            this.team___null = team___null;
            return this;
        }

        public Builder setTeam___not___null(Boolean team___not___null) {
            this.team___not___null = team___not___null;
            return this;
        }

        public Builder setTeam___in(java.util.List<String> team___in) {
            this.team___in = team___in;
            return this;
        }

        public Builder setTeam___not___in(java.util.List<String> team___not___in) {
            this.team___not___in = team___not___in;
            return this;
        }

        public Builder setTeam___lt(String team___lt) {
            this.team___lt = team___lt;
            return this;
        }

        public Builder setTeam___lte(String team___lte) {
            this.team___lte = team___lte;
            return this;
        }

        public Builder setTeam___gt(String team___gt) {
            this.team___gt = team___gt;
            return this;
        }

        public Builder setTeam___gte(String team___gte) {
            this.team___gte = team___gte;
            return this;
        }

        public Builder setTeam___contains(String team___contains) {
            this.team___contains = team___contains;
            return this;
        }

        public Builder setTeam___not___contains(String team___not___contains) {
            this.team___not___contains = team___not___contains;
            return this;
        }

        public Builder setTeam___starts_with(String team___starts_with) {
            this.team___starts_with = team___starts_with;
            return this;
        }

        public Builder setTeam___not___starts_with(String team___not___starts_with) {
            this.team___not___starts_with = team___not___starts_with;
            return this;
        }

        public Builder setTeam___ends_with(String team___ends_with) {
            this.team___ends_with = team___ends_with;
            return this;
        }

        public Builder setTeam___not___ends_with(String team___not___ends_with) {
            this.team___not___ends_with = team___not___ends_with;
            return this;
        }

        public Builder setUsername___eq(String username___eq) {
            this.username___eq = username___eq;
            return this;
        }

        public Builder setUsername___ne(String username___ne) {
            this.username___ne = username___ne;
            return this;
        }

        public Builder setUsername___null(Boolean username___null) {
            this.username___null = username___null;
            return this;
        }

        public Builder setUsername___not___null(Boolean username___not___null) {
            this.username___not___null = username___not___null;
            return this;
        }

        public Builder setUsername___in(java.util.List<String> username___in) {
            this.username___in = username___in;
            return this;
        }

        public Builder setUsername___not___in(java.util.List<String> username___not___in) {
            this.username___not___in = username___not___in;
            return this;
        }

        public Builder setUsername___lt(String username___lt) {
            this.username___lt = username___lt;
            return this;
        }

        public Builder setUsername___lte(String username___lte) {
            this.username___lte = username___lte;
            return this;
        }

        public Builder setUsername___gt(String username___gt) {
            this.username___gt = username___gt;
            return this;
        }

        public Builder setUsername___gte(String username___gte) {
            this.username___gte = username___gte;
            return this;
        }

        public Builder setUsername___contains(String username___contains) {
            this.username___contains = username___contains;
            return this;
        }

        public Builder setUsername___not___contains(String username___not___contains) {
            this.username___not___contains = username___not___contains;
            return this;
        }

        public Builder setUsername___starts_with(String username___starts_with) {
            this.username___starts_with = username___starts_with;
            return this;
        }

        public Builder setUsername___not___starts_with(String username___not___starts_with) {
            this.username___not___starts_with = username___not___starts_with;
            return this;
        }

        public Builder setUsername___ends_with(String username___ends_with) {
            this.username___ends_with = username___ends_with;
            return this;
        }

        public Builder setUsername___not___ends_with(String username___not___ends_with) {
            this.username___not___ends_with = username___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<Cli_UserFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<Cli_UserFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(Cli_UserFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public Cli_UserFilterDTO build() {
            Cli_UserFilterDTO result = new Cli_UserFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.set_createdby___eq(this._createdby___eq);
            result.set_createdby___ne(this._createdby___ne);
            result.set_createdby___null(this._createdby___null);
            result.set_createdby___not___null(this._createdby___not___null);
            result.set_createdby___in(this._createdby___in);
            result.set_createdby___not___in(this._createdby___not___in);
            result.set_createdby___lt(this._createdby___lt);
            result.set_createdby___lte(this._createdby___lte);
            result.set_createdby___gt(this._createdby___gt);
            result.set_createdby___gte(this._createdby___gte);
            result.set_createdby___contains(this._createdby___contains);
            result.set_createdby___not___contains(this._createdby___not___contains);
            result.set_createdby___starts_with(this._createdby___starts_with);
            result.set_createdby___not___starts_with(this._createdby___not___starts_with);
            result.set_createdby___ends_with(this._createdby___ends_with);
            result.set_createdby___not___ends_with(this._createdby___not___ends_with);
            result.set_createdon___eq(this._createdon___eq);
            result.set_createdon___ne(this._createdon___ne);
            result.set_createdon___null(this._createdon___null);
            result.set_createdon___not___null(this._createdon___not___null);
            result.set_createdon___in(this._createdon___in);
            result.set_createdon___not___in(this._createdon___not___in);
            result.set_createdon___lt(this._createdon___lt);
            result.set_createdon___lte(this._createdon___lte);
            result.set_createdon___gt(this._createdon___gt);
            result.set_createdon___gte(this._createdon___gte);
            result.set_id___eq(this._id___eq);
            result.set_id___ne(this._id___ne);
            result.set_id___null(this._id___null);
            result.set_id___not___null(this._id___not___null);
            result.set_id___in(this._id___in);
            result.set_id___not___in(this._id___not___in);
            result.set_id___lt(this._id___lt);
            result.set_id___lte(this._id___lte);
            result.set_id___gt(this._id___gt);
            result.set_id___gte(this._id___gte);
            result.setAdmin___eq(this.admin___eq);
            result.setAdmin___ne(this.admin___ne);
            result.setAdmin___null(this.admin___null);
            result.setAdmin___not___null(this.admin___not___null);
            result.setEmail___eq(this.email___eq);
            result.setEmail___ne(this.email___ne);
            result.setEmail___null(this.email___null);
            result.setEmail___not___null(this.email___not___null);
            result.setEmail___in(this.email___in);
            result.setEmail___not___in(this.email___not___in);
            result.setEmail___lt(this.email___lt);
            result.setEmail___lte(this.email___lte);
            result.setEmail___gt(this.email___gt);
            result.setEmail___gte(this.email___gte);
            result.setEmail___contains(this.email___contains);
            result.setEmail___not___contains(this.email___not___contains);
            result.setEmail___starts_with(this.email___starts_with);
            result.setEmail___not___starts_with(this.email___not___starts_with);
            result.setEmail___ends_with(this.email___ends_with);
            result.setEmail___not___ends_with(this.email___not___ends_with);
            result.setForceChangePassword___eq(this.forceChangePassword___eq);
            result.setForceChangePassword___ne(this.forceChangePassword___ne);
            result.setForceChangePassword___null(this.forceChangePassword___null);
            result.setForceChangePassword___not___null(this.forceChangePassword___not___null);
            result.setMpoxicona_vac___eq(this.mpoxicona_vac___eq);
            result.setMpoxicona_vac___ne(this.mpoxicona_vac___ne);
            result.setMpoxicona_vac___null(this.mpoxicona_vac___null);
            result.setMpoxicona_vac___not___null(this.mpoxicona_vac___not___null);
            result.setProfile___eq(this.profile___eq);
            result.setProfile___ne(this.profile___ne);
            result.setProfile___null(this.profile___null);
            result.setProfile___not___null(this.profile___not___null);
            result.setProfile___in(this.profile___in);
            result.setProfile___not___in(this.profile___not___in);
            result.setProfile___lt(this.profile___lt);
            result.setProfile___lte(this.profile___lte);
            result.setProfile___gt(this.profile___gt);
            result.setProfile___gte(this.profile___gte);
            result.setProfile___contains(this.profile___contains);
            result.setProfile___not___contains(this.profile___not___contains);
            result.setProfile___starts_with(this.profile___starts_with);
            result.setProfile___not___starts_with(this.profile___not___starts_with);
            result.setProfile___ends_with(this.profile___ends_with);
            result.setProfile___not___ends_with(this.profile___not___ends_with);
            result.setTeam___eq(this.team___eq);
            result.setTeam___ne(this.team___ne);
            result.setTeam___null(this.team___null);
            result.setTeam___not___null(this.team___not___null);
            result.setTeam___in(this.team___in);
            result.setTeam___not___in(this.team___not___in);
            result.setTeam___lt(this.team___lt);
            result.setTeam___lte(this.team___lte);
            result.setTeam___gt(this.team___gt);
            result.setTeam___gte(this.team___gte);
            result.setTeam___contains(this.team___contains);
            result.setTeam___not___contains(this.team___not___contains);
            result.setTeam___starts_with(this.team___starts_with);
            result.setTeam___not___starts_with(this.team___not___starts_with);
            result.setTeam___ends_with(this.team___ends_with);
            result.setTeam___not___ends_with(this.team___not___ends_with);
            result.setUsername___eq(this.username___eq);
            result.setUsername___ne(this.username___ne);
            result.setUsername___null(this.username___null);
            result.setUsername___not___null(this.username___not___null);
            result.setUsername___in(this.username___in);
            result.setUsername___not___in(this.username___not___in);
            result.setUsername___lt(this.username___lt);
            result.setUsername___lte(this.username___lte);
            result.setUsername___gt(this.username___gt);
            result.setUsername___gte(this.username___gte);
            result.setUsername___contains(this.username___contains);
            result.setUsername___not___contains(this.username___not___contains);
            result.setUsername___starts_with(this.username___starts_with);
            result.setUsername___not___starts_with(this.username___not___starts_with);
            result.setUsername___ends_with(this.username___ends_with);
            result.setUsername___not___ends_with(this.username___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
