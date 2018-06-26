/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jake
 */
public class Question implements Serializable{
    
    private String question;
    private String answer;
    private long score;
    private long amount;
    private ArrayList<ChallengeScene> scene = new ArrayList<>();

    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public ArrayList<ChallengeScene> getScene() {
        return scene;
    }

    public void setScene(ArrayList<ChallengeScene> scene) {
        this.scene = scene;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.question);
        hash = 89 * hash + Objects.hashCode(this.answer);
        hash = 89 * hash + (int) (this.score ^ (this.score >>> 32));
        hash = 89 * hash + (int) (this.amount ^ (this.amount >>> 32));
        hash = 89 * hash + Objects.hashCode(this.scene);
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
        final Question other = (Question) obj;
        if (this.score != other.score) {
            return false;
        }
        if (this.amount != other.amount) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "question=" + question + ", answer=" + answer + ", score=" + score + ", amount=" + amount + ", scene=" + scene + '}';
    }

    
}
