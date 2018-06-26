/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jake
 */
public class Relationship implements Serializable{
    
    private long relationshipScore;
    private String status;
    private Actor actorOne;
    private Actor actorTwo;

    public Relationship() {
    }

    public long getRelationshipScore() {
        return relationshipScore;
    }

    public void setRelationshipScore(long relationshipScore) {
        this.relationshipScore = relationshipScore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Actor getActorOne() {
        return actorOne;
    }

    public void setActorOne(Actor actorOne) {
        this.actorOne = actorOne;
    }

    public Actor getActorTwo() {
        return actorTwo;
    }

    public void setActorTwo(Actor actorTwo) {
        this.actorTwo = actorTwo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (this.relationshipScore ^ (this.relationshipScore >>> 32));
        hash = 89 * hash + Objects.hashCode(this.status);
        hash = 89 * hash + Objects.hashCode(this.actorOne);
        hash = 89 * hash + Objects.hashCode(this.actorTwo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Relationship other = (Relationship) obj;
        if (this.relationshipScore != other.relationshipScore) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (this.actorOne != other.actorOne) {
            return false;
        }
        if (this.actorTwo != other.actorTwo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Relationship{" + "relationshipScore=" + relationshipScore + ", status=" + status + ", actorOne=" + actorOne + ", actorTwo=" + actorTwo + '}';
    }


   
    
}
