package io.javabrains.springbootquickstart.topic;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
	} 

	//{id} tells that id is a variable 
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	//We want to use POST method
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	//We want to use PUT method
		@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
		public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
			topicService.updateTopic(topic,id);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
		public void deleteTopic(@PathVariable String id) {
			topicService.deleteTopic(id);
		}
}
