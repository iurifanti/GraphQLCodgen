package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for _User
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class _UserResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public _UserResponseProjection() {
    }

    public _UserResponseProjection(_UserResponseProjection projection) {
        super(projection);
    }

    public _UserResponseProjection(List<_UserResponseProjection> projections) {
        super(projections);
    }

    public _UserResponseProjection all$() {
        return all$(3);
    }

    public _UserResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this.admin();
        this.email();
        this.forceChangePassword();
        this.mpoxicona_vac();
        this.profile();
        this.team();
        this.username();
        this.typename();
        return this;
    }

    public _UserResponseProjection _clientId() {
        return _clientId(null);
    }

    public _UserResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public _UserResponseProjection _createdby() {
        return _createdby(null);
    }

    public _UserResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public _UserResponseProjection _createdon() {
        return _createdon(null);
    }

    public _UserResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public _UserResponseProjection _id() {
        return _id(null);
    }

    public _UserResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public _UserResponseProjection admin() {
        return admin(null);
    }

    public _UserResponseProjection admin(String alias) {
        add$(new GraphQLResponseField("admin").alias(alias));
        return this;
    }

    public _UserResponseProjection email() {
        return email(null);
    }

    public _UserResponseProjection email(String alias) {
        add$(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public _UserResponseProjection forceChangePassword() {
        return forceChangePassword(null);
    }

    public _UserResponseProjection forceChangePassword(String alias) {
        add$(new GraphQLResponseField("forceChangePassword").alias(alias));
        return this;
    }

    public _UserResponseProjection mpoxicona_vac() {
        return mpoxicona_vac(null);
    }

    public _UserResponseProjection mpoxicona_vac(String alias) {
        add$(new GraphQLResponseField("mpoxicona_vac").alias(alias));
        return this;
    }

    public _UserResponseProjection profile() {
        return profile(null);
    }

    public _UserResponseProjection profile(String alias) {
        add$(new GraphQLResponseField("profile").alias(alias));
        return this;
    }

    public _UserResponseProjection team() {
        return team(null);
    }

    public _UserResponseProjection team(String alias) {
        add$(new GraphQLResponseField("team").alias(alias));
        return this;
    }

    public _UserResponseProjection username() {
        return username(null);
    }

    public _UserResponseProjection username(String alias) {
        add$(new GraphQLResponseField("username").alias(alias));
        return this;
    }

    public _UserResponseProjection typename() {
        return typename(null);
    }

    public _UserResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public _UserResponseProjection deepCopy$() {
        return new _UserResponseProjection(this);
    }


}
