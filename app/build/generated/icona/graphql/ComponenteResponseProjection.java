package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Componente
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class ComponenteResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public ComponenteResponseProjection() {
    }

    public ComponenteResponseProjection(ComponenteResponseProjection projection) {
        super(projection);
    }

    public ComponenteResponseProjection(List<ComponenteResponseProjection> projections) {
        super(projections);
    }

    public ComponenteResponseProjection all$() {
        return all$(3);
    }

    public ComponenteResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.classe();
        this.codice();
        this.codice_classe();
        this.desc();
        this.nome();
        if (projectionDepthOnFields.getOrDefault("ComponenteResponseProjection.ClassePageResponseProjection.classe____associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComponenteResponseProjection.ClassePageResponseProjection.classe____associables", projectionDepthOnFields.getOrDefault("ComponenteResponseProjection.ClassePageResponseProjection.classe____associables", 0) + 1);
            this.classe____associables(new ClassePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComponenteResponseProjection.ClassePageResponseProjection.classe____associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ComponenteResponseProjection.ClasseResponseProjection.classe_", 0) <= maxDepth) {
            projectionDepthOnFields.put("ComponenteResponseProjection.ClasseResponseProjection.classe_", projectionDepthOnFields.getOrDefault("ComponenteResponseProjection.ClasseResponseProjection.classe_", 0) + 1);
            this.classe_(new ClasseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ComponenteResponseProjection.ClasseResponseProjection.classe_", 0)));
        }
        this.typename();
        return this;
    }

    public ComponenteResponseProjection _clientId() {
        return _clientId(null);
    }

    public ComponenteResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public ComponenteResponseProjection _createdby() {
        return _createdby(null);
    }

    public ComponenteResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public ComponenteResponseProjection _createdon() {
        return _createdon(null);
    }

    public ComponenteResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public ComponenteResponseProjection _id() {
        return _id(null);
    }

    public ComponenteResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public ComponenteResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public ComponenteResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public ComponenteResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public ComponenteResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public ComponenteResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public ComponenteResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public ComponenteResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public ComponenteResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public ComponenteResponseProjection classe() {
        return classe(null);
    }

    public ComponenteResponseProjection classe(String alias) {
        add$(new GraphQLResponseField("classe").alias(alias));
        return this;
    }

    public ComponenteResponseProjection codice() {
        return codice(null);
    }

    public ComponenteResponseProjection codice(String alias) {
        add$(new GraphQLResponseField("codice").alias(alias));
        return this;
    }

    public ComponenteResponseProjection codice_classe() {
        return codice_classe(null);
    }

    public ComponenteResponseProjection codice_classe(String alias) {
        add$(new GraphQLResponseField("codice_classe").alias(alias));
        return this;
    }

    public ComponenteResponseProjection desc() {
        return desc(null);
    }

    public ComponenteResponseProjection desc(String alias) {
        add$(new GraphQLResponseField("desc").alias(alias));
        return this;
    }

    public ComponenteResponseProjection nome() {
        return nome(null);
    }

    public ComponenteResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public ComponenteResponseProjection classe____associables(ClassePageResponseProjection subProjection) {
        return classe____associables((String)null, subProjection);
    }

    public ComponenteResponseProjection classe____associables(String alias, ClassePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("classe____associables").alias(alias).projection(subProjection));
        return this;
    }

    public ComponenteResponseProjection classe____associables(ComponenteClasse____associablesParametrizedInput input, ClassePageResponseProjection subProjection) {
        return classe____associables(null, input, subProjection);
    }

    public ComponenteResponseProjection classe____associables(String alias, ComponenteClasse____associablesParametrizedInput input, ClassePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("classe____associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ComponenteResponseProjection classe_(ClasseResponseProjection subProjection) {
        return classe_(null, subProjection);
    }

    public ComponenteResponseProjection classe_(String alias, ClasseResponseProjection subProjection) {
        add$(new GraphQLResponseField("classe_").alias(alias).projection(subProjection));
        return this;
    }

    public ComponenteResponseProjection typename() {
        return typename(null);
    }

    public ComponenteResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public ComponenteResponseProjection deepCopy$() {
        return new ComponenteResponseProjection(this);
    }


}
