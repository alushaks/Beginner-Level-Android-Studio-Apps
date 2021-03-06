package id.merahmuda.bcd.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import id.merahmuda.bcd.model.Pengaduan;
import id.merahmuda.bcd.model.Review;

/**
 * Created by Ujang Wahyu on 04,Oktober,2018
 */
public class ResponsePengaduan {
    @SerializedName("data")
    @Expose
    private List<Pengaduan> data = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;
    public List<Pengaduan> getData() {
        return data;
    }

    public void setData(List<Pengaduan> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
