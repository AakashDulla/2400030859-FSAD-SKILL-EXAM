
package com.klef.fsad.exam.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.Transport;
import com.klef.fsad.exam.repository.TransportRepository;

@Service
public class TransportService 
{
 @Autowired
 private TransportRepository repo;

 public Transport addTransport(Transport t)
 {
  return repo.save(t);
 }

 public String deleteTransport(int id)
 {
  Optional<Transport> obj = repo.findById(id);
  if(obj.isPresent())
  {
   repo.deleteById(id);
   return "Transport Deleted Successfully";
  }
  else
  {
   return "Transport Not Found";
  }
 }
}
