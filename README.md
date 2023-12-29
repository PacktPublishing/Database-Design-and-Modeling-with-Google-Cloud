# Database Design and Modeling with Google Cloud

<a href="https://www.packtpub.com/product/database-design-and-modeling-with-google-cloud/97818046114563"><img src="https://m.media-amazon.com/images/W/MEDIAX_792452-T2/images/I/71Hq8q+1deL._SL1360_.jpg" alt="Database Design and Modeling with Google Cloud" height="256px" align="right"></a>

This is the code repository for [Database Design and Modeling with Google Cloud](https://www.packtpub.com/product/database-design-and-modeling-with-google-cloud/9781804611456), published by Packt.

**Learn database design and development to take your data to applications, analytics, and AI**

## What is this book about?

n the age of lightning-speed delivery, customers want everything developed, built, and delivered at high speed and at scale. Knowledge, design, and choice of database is critical in that journey, but there is no one-size-fits-all solution. This book serves as a comprehensive and practical guide for data professionals who want to design and model their databases efficiently.

This book covers the following exciting features: 
* Understand different use cases and real-world applications of data in the cloud
* Work with document and indexed NoSQL databases
* Get to grips with modeling considerations for analytics, AI, and ML
* Use real-world examples to learn about ETL services
* Design structured, semi-structured, and unstructured data for your applications and analytics
* Improve observability, performance, security, scalability, latency SLAs, SLIs, and SLOs

If you feel this book is for you, get your [copy](https://www.amazon.in/Database-Design-Modeling-Google-Cloud/dp/180461145X/ref=monarch_sidesheet) today!

<a href="https://www.packtpub.com/product/database-design-and-modeling-with-google-cloud/9781804611456"><img src="https://raw.githubusercontent.com/PacktPublishing/GitHub/master/GitHub.png" alt="https://www.packtpub.com/" border="5" /></a>

## Instructions and Navigations
All of the code is organized into folders.

The code will look like the following:
```
SELECT country_name, MAX(cumulative_confirmed) AS TOTAL_CONFIRMED_COVID19
FROM `bigquery-public-data.covid19_open_data.covid19_open_data`
WHERE cumulative_confirmed > 0
GROUP BY country_name
ORDER BY MAX(cumulative_confirmed) DESC
LIMIT 5;
```

**Following is what you need for this book:**
This book is for database developers, data engineers, and architects looking to design, model, and build database applications on the cloud with an extended focus on operational consideration and taking their data to AI. Data scientists, as well ML and AI engineers who want to use Google Cloud services in the data to AI journey will also find plenty of useful information in this book. It will also be useful to data analysts and BI developers who want to use SQL impactfully to generate ML and generative AI insights from their data.

With the following software and hardware list you can run all code files present in the book (Chapter 1-10).

### Software and Hardware List

| Chapter  | Software required                                                                    | OS required                        |
| -------- | ------------------------------------------------------------| -----------------------------------|
|  	1-10	   |   	SQL (BigQuery)                                  			  | Any OS | 		
|  	1-10	   |   	Java 11                                  			  | Any OS | 		
|  	1-10	   |   	Google Cloud services (on browser): Spanner, Cloud SQL, Firestore, BigQuery, Cloud Storage, Cloud Functions, Cloud Run, Cloud Shell  | Any OS | 		


### Related products <Other books you may enjoy>
* Data Engineering with Google Cloud Platform  [[Packt]](https://www.packtpub.com/product/data-engineering-with-google-cloud-platform/9781800561328) [[Amazon]](https://www.amazon.in/Data-Engineering-Google-Cloud-Platform/dp/1800561326/ref=sr_1_1?keywords=Data+Engineering+with+Google+Cloud+Platform&s=books&sr=1-1)
  
* Machine Learning with BigQuery ML  [[Packt]](https://www.packtpub.com/product/machine-learning-with-bigquery-ml/9781800560307) [[Amazon]](https://www.amazon.in/Machine-Learning-BigQuery-ML-learning/dp/1800560303/ref=sr_1_2?keywords=Machine+Learning+with+BigQuery+ML&s=books&sr=1-2)
  
## Get to Know the Author
**Abirami Sukumaran** is a lead developer advocate at Google, focusing on databases and data to AI journey with Google Cloud. She has over 17 years of experience in data management, data governance, and analytics across several industries in various roles from engineering to leadership, and has 3 patents filed in the data area. She believes in driving social and business impact with technology. She is also an international keynote, tech panel, and motivational speaker, including key events like Google I/O, Cloud NEXT, MLDS, GDS, Huddle Global, India Startup Festival, Women Developers Academy, and so on. She founded Code Vipassana, an award-winning, non-profit, tech-enablement program powered by Google and she run with the support of Google Developer Communities GDG Cloud Kochi, Chennai, Mumbai, and a few developer leads. She is pursuing her doctoral research in business administration with artificial intelligence, is a certified Yoga instructor, practitioner, and an Indian above everything else.
