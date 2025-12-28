package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for User_message
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class User_messageResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public User_messageResponseProjection() {
    }

    public User_messageResponseProjection(User_messageResponseProjection projection) {
        super(projection);
    }

    public User_messageResponseProjection(List<User_messageResponseProjection> projections) {
        super(projections);
    }

    public User_messageResponseProjection all$() {
        return all$(3);
    }

    public User_messageResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.messaggio();
        this.scadenza_messaggio();
        this.typename();
        return this;
    }

    public User_messageResponseProjection _clientId() {
        return _clientId(null);
    }

    public User_messageResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public User_messageResponseProjection _id() {
        return _id(null);
    }

    public User_messageResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public User_messageResponseProjection messaggio() {
        return messaggio(null);
    }

    public User_messageResponseProjection messaggio(String alias) {
        add$(new GraphQLResponseField("messaggio").alias(alias));
        return this;
    }

    public User_messageResponseProjection scadenza_messaggio() {
        return scadenza_messaggio(null);
    }

    public User_messageResponseProjection scadenza_messaggio(String alias) {
        add$(new GraphQLResponseField("scadenza_messaggio").alias(alias));
        return this;
    }

    public User_messageResponseProjection typename() {
        return typename(null);
    }

    public User_messageResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public User_messageResponseProjection deepCopy$() {
        return new User_messageResponseProjection(this);
    }


}
