# Timothy Lora
### Chainalysis Questionnaire

1) Are there any sub-optimal choices (or short cuts taken due to limited time) in your implementation?
<br/><br/>
    Yes, the implementation is as basic as possible, one spot for improvement would be where the requests are made.
The current implementation is making six requests one after another they could be made in parallel to make it more efficient.
Also Coinbase and Gemini were specifically selected because they are free and open API's,
meaning no API key was needed, but unfortinaly the rates are lower so this implementation could hit rate limits
fairly quickly if the traffic ramped up.


2) Is any part of it over-designed? (It is fine to over-design to showcase your skills as long as you are clear about it)
<br/><br/>
    No, I don't think so.


3) If you have to scale your solution to 100 users/second traffic what changes would you make, if any?
<br/><br/>
I would make some of the changes mentioned above, making the requests in parallel and choosing better API's with
higher rate limits. 


4) What are some other enhancements you would have made, if you had more time to do this implementation
<br/><br/>
    If I had more time I would add more exchanges and more currencies. Give the website a better design including
a more visual/interactive way to see the price across all exchanges.
