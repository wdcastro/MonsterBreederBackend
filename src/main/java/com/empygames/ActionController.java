package com.empygames;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {
	
	HashMap<String, Monster> usermap = new HashMap<String, Monster>();

	@CrossOrigin
	@RequestMapping(value = "/action", method = RequestMethod.POST)
	public ResponseEntity<GameAction> action(@RequestBody GameAction gameaction){
		return new ResponseEntity<GameAction>(gameaction, HttpStatus.OK);
	}
		
	
	@CrossOrigin
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public ResponseEntity<GameAction> action(@RequestParam(required=false, defaultValue="World") String name){
		System.out.println("new get");
		System.out.println(name);
		GameAction gameaction = new GameAction();
		gameaction.setContent("asdfjkl");
		return new ResponseEntity<GameAction>(gameaction, HttpStatus.OK);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/empty", method = RequestMethod.GET)
	public ResponseEntity<String> emptyMap(@RequestParam(required=false, defaultValue="false") String delete){
		usermap.clear();
		return new ResponseEntity<String>("Emptied", HttpStatus.OK);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public ResponseEntity<String> getMap(@RequestParam(required=false, defaultValue="false") String delete){
		return new ResponseEntity<String>(usermap.keySet().toString(), HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<LoginResult> login(@RequestBody UserData userdata){
		System.out.println("Logging in UserID: "+userdata.userID+", AuthKey: "+userdata.authKey);
		int logincode;
		if(usermap.containsKey(userdata.userID)){
			logincode = 1;
		} else {
			logincode = 3;
		}
		LoginResult response = new LoginResult(userdata.userID, logincode, userdata.authKey);
		return new ResponseEntity<LoginResult>(response, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/load", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Monster> load(@RequestBody UserData userdata){
		System.out.println("Loading monster: UserID: "+userdata.userID+", AuthKey: "+userdata.authKey);
		return new ResponseEntity<Monster>(usermap.get(userdata.userID), HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<SaveData> load(@RequestBody SaveData savedata){
		System.out.println("Save data");
		savedata.exists();
		usermap.put(savedata.userdata.userID, savedata.monster);
		return new ResponseEntity<SaveData>(savedata, HttpStatus.OK);
	}

	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/time", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<TimeData> getTime(@RequestBody UserData userdata){
		System.out.println("Requested timestamp by UserID: "+userdata.userID+", AuthKey: "+userdata.authKey);
		TimeData response = new TimeData(userdata.userID);
		System.out.println("Timestamp: "+ response.timestamp);
		return new ResponseEntity<TimeData>(response, HttpStatus.OK);
	}
	
	@CrossOrigin(origins = "http://localhost:4200") //combine with save?
	@RequestMapping(value = "/monster", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity<Monster> registerMonster(@RequestBody Monster monster){
		System.out.println("New monster registered by "+monster.owner);
		usermap.put(monster.owner, monster);
		return new ResponseEntity<Monster>(monster, HttpStatus.OK);
	}
}
