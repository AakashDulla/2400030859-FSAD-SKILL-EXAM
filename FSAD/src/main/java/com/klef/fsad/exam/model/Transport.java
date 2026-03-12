
package com.klef.fsad.exam.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Transport 
{
 @Id
 private int transportId;
 private String name;
 private String date;
 private String status;

 public int getTransportId() { return transportId; }
 public void setTransportId(int transportId) { this.transportId = transportId; }

 public String getName() { return name; }
 public void setName(String name) { this.name = name; }

 public String getDate() { return date; }
 public void setDate(String date) { this.date = date; }

 public String getStatus() { return status; }
 public void setStatus(String status) { this.status = status; }
}
