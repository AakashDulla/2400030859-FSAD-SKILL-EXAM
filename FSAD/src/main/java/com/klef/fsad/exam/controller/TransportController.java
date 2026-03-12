
package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Transport;
import com.klef.fsad.exam.service.TransportService;

@RestController
@RequestMapping("/transport")
public class TransportController 
{
 @Autowired
 private TransportService service;

 @PostMapping
 public Transport addTransport(@RequestBody Transport t)
 {
  return service.addTransport(t);
 }

 @DeleteMapping("/{id}")
 public String deleteTransport(@PathVariable int id)
 {
  return service.deleteTransport(id);
 }
}
