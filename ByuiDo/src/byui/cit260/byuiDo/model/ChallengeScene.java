/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.model;

import java.util.Objects;

/**
 *
 * @author Jake
 */
public class ChallengeScene extends Location{
    private long noCorrect;
    private long requiredCorrect;
    private Question question;

    public ChallengeScene() {
    }

    public long getNoCorrect() {
        return noCorrect;
    }

    public void setNoCorrect(long noCorrect) {
        this.noCorrect = noCorrect;
    }

    public long getRequiredCorrect() {
        return requiredCorrect;
    }

    public void setRequiredCorrect(long requiredCorrect) {
        this.requiredCorrect = requiredCorrect;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (int) (this.noCorrect ^ (this.noCorrect >>> 32));
        hash = 73 * hash + (int) (this.requiredCorrect ^ (this.requiredCorrect >>> 32));
        hash = 73 * hash + Objects.hashCode(this.question);
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
        final ChallengeScene other = (ChallengeScene) obj;
        if (this.noCorrect != other.noCorrect) {
            return false;
        }
        if (this.requiredCorrect != other.requiredCorrect) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ChallengeScene{" + "noCorrect=" + noCorrect + ", requiredCorrect=" + requiredCorrect + ", question=" + question + '}';
    }

   
}
