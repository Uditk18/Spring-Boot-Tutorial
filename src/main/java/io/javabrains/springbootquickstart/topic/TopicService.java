//Topic Service is basically singleton

package io.javabrains.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	// Moved this to service from controller (Business Service)
	//topics is initialized only once, so there is only one copy of this
	//ArrayList<> to make it mutable
	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Spring", "Springframework", "SP description"),
			new Topic("Java", "Core Java", "Java description"), new Topic("C++", "C++", "C description")));

	public List<Topic> getAllTopics() {
		return topics;
	}
	
	//gives only one topic as output
	//We are looking for one id only
	public Topic getTopic(String id)
	{
		//lambda expression
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}
	
	public void updateTopic(Topic topic, String id)
	{
		for(int i=0;i<topics.size();i++)
		{
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);			}
				return;
		}
		topics.add(topic,id);
	}

	public void deleteTopic(String id) {
			topics.removeIf(t->t.getId().equals(id));
	}
	
}
