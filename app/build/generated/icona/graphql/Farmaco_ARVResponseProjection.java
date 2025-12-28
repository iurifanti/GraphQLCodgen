package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Farmaco_ARV
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Farmaco_ARVResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public Farmaco_ARVResponseProjection() {
    }

    public Farmaco_ARVResponseProjection(Farmaco_ARVResponseProjection projection) {
        super(projection);
    }

    public Farmaco_ARVResponseProjection(List<Farmaco_ARVResponseProjection> projections) {
        super(projections);
    }

    public Farmaco_ARVResponseProjection all$() {
        return all$(3);
    }

    public Farmaco_ARVResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.anno_generico();
        this.codice_DAD();
        this.componenti();
        this.generico();
        this.gruppo();
        this.long_acting();
        this.nome();
        this.nome_gruppo();
        this.nome_tipo();
        this.obsoleto();
        this.posologia();
        this.prep();
        this.sottogruppo();
        this.tipo();
        if (projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.ComponentePageResponseProjection.componente___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_ARVResponseProjection.ComponentePageResponseProjection.componente___associables", projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.ComponentePageResponseProjection.componente___associables", 0) + 1);
            this.componente___associables(new ComponentePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.ComponentePageResponseProjection.componente___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.ComponentePageResponseProjection.componente", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_ARVResponseProjection.ComponentePageResponseProjection.componente", projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.ComponentePageResponseProjection.componente", 0) + 1);
            this.componente(new ComponentePageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.ComponentePageResponseProjection.componente", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.DosaggioPageResponseProjection.dosaggio_", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_ARVResponseProjection.DosaggioPageResponseProjection.dosaggio_", projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.DosaggioPageResponseProjection.dosaggio_", 0) + 1);
            this.dosaggio_(new DosaggioPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.DosaggioPageResponseProjection.dosaggio_", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_ARVResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV___associables", projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV___associables", 0) + 1);
            this.terapia_ARV___associables(new Terapia_ARVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV", 0) <= maxDepth) {
            projectionDepthOnFields.put("Farmaco_ARVResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV", projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV", 0) + 1);
            this.terapia_ARV(new Terapia_ARVPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("Farmaco_ARVResponseProjection.Terapia_ARVPageResponseProjection.terapia_ARV", 0)));
        }
        this.typename();
        return this;
    }

    public Farmaco_ARVResponseProjection _clientId() {
        return _clientId(null);
    }

    public Farmaco_ARVResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection _createdby() {
        return _createdby(null);
    }

    public Farmaco_ARVResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection _createdon() {
        return _createdon(null);
    }

    public Farmaco_ARVResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection _id() {
        return _id(null);
    }

    public Farmaco_ARVResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public Farmaco_ARVResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public Farmaco_ARVResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public Farmaco_ARVResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public Farmaco_ARVResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection anno_generico() {
        return anno_generico(null);
    }

    public Farmaco_ARVResponseProjection anno_generico(String alias) {
        add$(new GraphQLResponseField("anno_generico").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection codice_DAD() {
        return codice_DAD(null);
    }

    public Farmaco_ARVResponseProjection codice_DAD(String alias) {
        add$(new GraphQLResponseField("codice_DAD").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection componenti() {
        return componenti(null);
    }

    public Farmaco_ARVResponseProjection componenti(String alias) {
        add$(new GraphQLResponseField("componenti").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection generico() {
        return generico(null);
    }

    public Farmaco_ARVResponseProjection generico(String alias) {
        add$(new GraphQLResponseField("generico").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection gruppo() {
        return gruppo(null);
    }

    public Farmaco_ARVResponseProjection gruppo(String alias) {
        add$(new GraphQLResponseField("gruppo").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection long_acting() {
        return long_acting(null);
    }

    public Farmaco_ARVResponseProjection long_acting(String alias) {
        add$(new GraphQLResponseField("long_acting").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection nome() {
        return nome(null);
    }

    public Farmaco_ARVResponseProjection nome(String alias) {
        add$(new GraphQLResponseField("nome").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection nome_gruppo() {
        return nome_gruppo(null);
    }

    public Farmaco_ARVResponseProjection nome_gruppo(String alias) {
        add$(new GraphQLResponseField("nome_gruppo").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection nome_tipo() {
        return nome_tipo(null);
    }

    public Farmaco_ARVResponseProjection nome_tipo(String alias) {
        add$(new GraphQLResponseField("nome_tipo").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection obsoleto() {
        return obsoleto(null);
    }

    public Farmaco_ARVResponseProjection obsoleto(String alias) {
        add$(new GraphQLResponseField("obsoleto").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection posologia() {
        return posologia(null);
    }

    public Farmaco_ARVResponseProjection posologia(String alias) {
        add$(new GraphQLResponseField("posologia").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection prep() {
        return prep(null);
    }

    public Farmaco_ARVResponseProjection prep(String alias) {
        add$(new GraphQLResponseField("prep").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection sottogruppo() {
        return sottogruppo(null);
    }

    public Farmaco_ARVResponseProjection sottogruppo(String alias) {
        add$(new GraphQLResponseField("sottogruppo").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection tipo() {
        return tipo(null);
    }

    public Farmaco_ARVResponseProjection tipo(String alias) {
        add$(new GraphQLResponseField("tipo").alias(alias));
        return this;
    }

    public Farmaco_ARVResponseProjection componente___associables(ComponentePageResponseProjection subProjection) {
        return componente___associables((String)null, subProjection);
    }

    public Farmaco_ARVResponseProjection componente___associables(String alias, ComponentePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("componente___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_ARVResponseProjection componente___associables(Farmaco_ARVComponente___associablesParametrizedInput input, ComponentePageResponseProjection subProjection) {
        return componente___associables(null, input, subProjection);
    }

    public Farmaco_ARVResponseProjection componente___associables(String alias, Farmaco_ARVComponente___associablesParametrizedInput input, ComponentePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("componente___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_ARVResponseProjection componente(ComponentePageResponseProjection subProjection) {
        return componente((String)null, subProjection);
    }

    public Farmaco_ARVResponseProjection componente(String alias, ComponentePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("componente").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_ARVResponseProjection componente(Farmaco_ARVComponenteParametrizedInput input, ComponentePageResponseProjection subProjection) {
        return componente(null, input, subProjection);
    }

    public Farmaco_ARVResponseProjection componente(String alias, Farmaco_ARVComponenteParametrizedInput input, ComponentePageResponseProjection subProjection) {
        add$(new GraphQLResponseField("componente").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_ARVResponseProjection dosaggio_(DosaggioPageResponseProjection subProjection) {
        return dosaggio_((String)null, subProjection);
    }

    public Farmaco_ARVResponseProjection dosaggio_(String alias, DosaggioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dosaggio_").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_ARVResponseProjection dosaggio_(Farmaco_ARVDosaggio_ParametrizedInput input, DosaggioPageResponseProjection subProjection) {
        return dosaggio_(null, input, subProjection);
    }

    public Farmaco_ARVResponseProjection dosaggio_(String alias, Farmaco_ARVDosaggio_ParametrizedInput input, DosaggioPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("dosaggio_").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_ARVResponseProjection terapia_ARV___associables(Terapia_ARVPageResponseProjection subProjection) {
        return terapia_ARV___associables((String)null, subProjection);
    }

    public Farmaco_ARVResponseProjection terapia_ARV___associables(String alias, Terapia_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_ARV___associables").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_ARVResponseProjection terapia_ARV___associables(Farmaco_ARVTerapia_ARV___associablesParametrizedInput input, Terapia_ARVPageResponseProjection subProjection) {
        return terapia_ARV___associables(null, input, subProjection);
    }

    public Farmaco_ARVResponseProjection terapia_ARV___associables(String alias, Farmaco_ARVTerapia_ARV___associablesParametrizedInput input, Terapia_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_ARV___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_ARVResponseProjection terapia_ARV(Terapia_ARVPageResponseProjection subProjection) {
        return terapia_ARV((String)null, subProjection);
    }

    public Farmaco_ARVResponseProjection terapia_ARV(String alias, Terapia_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_ARV").alias(alias).projection(subProjection));
        return this;
    }

    public Farmaco_ARVResponseProjection terapia_ARV(Farmaco_ARVTerapia_ARVParametrizedInput input, Terapia_ARVPageResponseProjection subProjection) {
        return terapia_ARV(null, input, subProjection);
    }

    public Farmaco_ARVResponseProjection terapia_ARV(String alias, Farmaco_ARVTerapia_ARVParametrizedInput input, Terapia_ARVPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("terapia_ARV").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public Farmaco_ARVResponseProjection typename() {
        return typename(null);
    }

    public Farmaco_ARVResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public Farmaco_ARVResponseProjection deepCopy$() {
        return new Farmaco_ARVResponseProjection(this);
    }


}
