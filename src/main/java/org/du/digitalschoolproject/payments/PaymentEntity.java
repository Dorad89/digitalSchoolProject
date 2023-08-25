package org.du.digitalschoolproject.payments;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.du.digitalschoolproject.commons.BaseEntity;

@Entity
public class PaymentEntity extends BaseEntity {

    private String paymentMode;
    private String paymentStatus;
    private long studentGroupId;

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public long getStudentGroupId() {
        return studentGroupId;
    }

    public void setStudentGroupId(long studentGroupId) {
        this.studentGroupId = studentGroupId;
    }
}
