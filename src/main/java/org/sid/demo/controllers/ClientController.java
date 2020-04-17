package org.sid.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.sid.demo.entities.Client;
import org.sid.demo.service.IClientServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	private IClientServ clientserv;

	@RequestMapping(value = "/")
	public String client(Model model) {
		

		return "client/client";
	}

}
