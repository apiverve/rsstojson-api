RSS to JSON API
============

RSS to JSON converts any RSS feed URL into structured JSON in real time. Each response returns the source domain, article counts, headlines, publication dates, summaries, and direct article links.


[![PyPI version](https://img.shields.io/pypi/v/apiverve-rsstojson.svg)](https://pypi.org/project/apiverve-rsstojson/)

This is a Python wrapper for the [RSS to JSON API](https://apiverve.com/marketplace/rsstojson?utm_source=pypi&utm_medium=referral&utm_content=readme)

---

## Installation

Using `pip`:

```bash
pip install apiverve-rsstojson
```

Using `pip3`:

```bash
pip3 install apiverve-rsstojson
```

---

## Configuration

Before using the RSS to JSON API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=pypi&utm_medium=referral&utm_content=readme)

---

## Quick Start

Here's a simple example to get you started quickly:

```python
from apiverve_rsstojson.apiClient import RsstojsonAPIClient

# Initialize the client with your APIVerve API key
api = RsstojsonAPIClient("[YOUR_API_KEY]")

query = { "url": "https://www.nasa.gov/rss/dyn/breaking_news.rss" }

try:
    # Make the API call
    result = api.execute(query)

    # Print the result
    print(result)
except Exception as e:
    print(f"Error: {e}")
```

---

## Usage

The RSS to JSON API documentation is found here: [https://docs.apiverve.com/ref/rsstojson](https://docs.apiverve.com/ref/rsstojson?utm_source=pypi&utm_medium=referral&utm_content=readme).
You can find parameters, example responses, and status codes documented here.

### Setup

```python
# Import the client module
from apiverve_rsstojson.apiClient import RsstojsonAPIClient

# Initialize the client with your APIVerve API key
api = RsstojsonAPIClient("[YOUR_API_KEY]")
```

---

## Perform Request

Using the API client, you can perform requests to the API.

###### Define Query

```python
query = { "url": "https://www.nasa.gov/rss/dyn/breaking_news.rss" }
```

###### Simple Request

```python
# Make a request to the API
result = api.execute(query)

# Print the result
print(result)
```

###### Example Response

```json
{
  "status": "ok",
  "error": null,
  "data": {
    "source": "www.nasa.gov",
    "articles": 10,
    "maxReached": false,
    "feed": [
      {
        "website": "NASA",
        "title": "NASA IXPE’s Longest Observation Solves Black Hole Jets Mystery",
        "pubDate": "Tue, 16 Dec 2025 21:23:13 +0000",
        "description": "Written by Michael Allen An international team of astronomers using NASA’s IXPE (Imaging X-ray Polarimetry Explorer) has identified the origin of X-rays in a supermassive black hole’s jet, answering a question that has been unresolved since the earliest days of X-ray astronomy. Their findings are described in a paper published in The Astrophysical Journal Letters, […]",
        "link": "https://www.nasa.gov/missions/ixpe/nasa-ixpes-longest-observation-solves-black-hole-jets-mystery/"
      },
      {
        "website": "NASA",
        "title": "NASA Launches Research Program for Students to Explore Big Ideas",
        "pubDate": "Tue, 16 Dec 2025 21:01:46 +0000",
        "description": "NASA is now accepting concepts for a new research challenge. The Opportunities in Research, Business, Innovation, and Technology (ORBIT) challenge is a multi-phase innovation competition designed to empower university and college students to develop next-generation solutions that benefit life on Earth and deep-space exploration. With up to $380,000 in total prize funding, NASA’s ORBIT challenges […]",
        "link": "https://www.nasa.gov/learning-resources/research-program-for-students/"
      },
      {
        "website": "NASA",
        "title": "Through Astronaut Eyes: 25 Years of Life in Orbit  ",
        "pubDate": "Tue, 16 Dec 2025 20:35:35 +0000",
        "description": "After 25 years of continuous human presence in space, the International Space Station remains a training and proving ground for deep space missions, enabling NASA to focus on Artemis missions to the Moon and Mars. The orbiting laboratory is also a living archive of human experience, culture, and connection.   Creating community With 290 visitors from […]",
        "link": "https://www.nasa.gov/centers-and-facilities/johnson/through-astronaut-eyes-25-years-of-life-in-orbit/"
      },
      {
        "website": "NASA",
        "title": "NASA Ignites New Golden Age of Exploration, Innovation in 2025",
        "pubDate": "Tue, 16 Dec 2025 19:48:18 +0000",
        "description": "With a second Trump Administration at the helm in 2025, NASA marked significant progress toward the Artemis II test flight early next year, which is the first crewed mission around the Moon in more than 50 years, as well as built upon its momentum toward a human return to the lunar surface in preparation to […]",
        "link": "https://www.nasa.gov/news-release/nasa-ignites-new-golden-age-of-exploration-innovation-in-2025/"
      },
      {
        "website": "NASA",
        "title": "How Small Is Too Small? Volunteers Help NASA Test Lake Monitoring From Space",
        "pubDate": "Tue, 16 Dec 2025 19:45:41 +0000",
        "description": "Volunteers participating in the Lake Observations by Citizen Scientists and Satellites (LOCSS) project have been collecting water level data in lakes since 2017. Now, the LOCSS team has used these data to examine the accuracy of water level measurements made from space.",
        "link": "https://science.nasa.gov/get-involved/citizen-science/how-small-is-too-small-volunteers-help-nasa-test-lake-monitoring-from-space/"
      },
      {
        "website": "NASA",
        "title": "NASA JPL Shakes Things Up Testing Future Commercial Lunar Spacecraft",
        "pubDate": "Tue, 16 Dec 2025 19:43:07 +0000",
        "description": "The same historic facilities that some 50 years ago prepared NASA’s twin Voyager probes for their ongoing interstellar odyssey are helping to ready a towering commercial spacecraft for a journey to the Moon. Launches involve brutal shaking and astonishingly loud noises, and testing in these facilities mimics those conditions to help ensure mission hardware can […]",
        "link": "https://www.nasa.gov/centers-and-facilities/jpl/nasa-jpl-shakes-things-up-testing-future-commercial-lunar-spacecraft/"
      },
      {
        "website": "NASA",
        "title": "Peekaboo!",
        "pubDate": "Tue, 16 Dec 2025 17:27:30 +0000",
        "description": "Clockwise from left, JAXA (Japan Aerospace Exploration Agency) astronaut Kimiya Yui and NASA astronauts Jonny Kim, Zena Cardman, and Mike Fincke pose for a playful portrait through a circular opening in a hatch thermal cover aboard the International Space Station on Sept. 18, 2025. The cover provides micrometeoroid and orbital debris protection while maintaining cleanliness […]",
        "link": "https://www.nasa.gov/image-article/peekaboo-2/"
      },
      {
        "website": "NASA",
        "title": "Toxicology and Environmental Chemistry",
        "pubDate": "Tue, 16 Dec 2025 16:28:12 +0000",
        "description": "Ensuring Astronaut Safety Achieving safe exploration of space in vehicles that rely upon closed environmental systems to recycle air and water to sustain life and are operated in extremely remote locations is a major challenge. The Toxicology and Environmental Chemistry (TEC) group at Johnson Space Center (JSC) is made up of 2 interrelated groups: Toxicology […]",
        "link": "https://www.nasa.gov/directorates/esdmd/hhp/toxicology-and-environmental-chemistry/"
      },
      {
        "website": "NASA",
        "title": "Statistics and Data Science",
        "pubDate": "Tue, 16 Dec 2025 16:14:41 +0000",
        "description": "Enabling Successful Research A major aim of biomedical research at NASA is to acquire data to evaluate, understand, and assess the biomedical hazards of spaceflight and to develop effective countermeasures. Data Science (S&DS) personnel provide statistical support to groups within the NASA JSC Human Health and Performance Directorate and other NASA communities. They have expertise […]",
        "link": "https://www.nasa.gov/directorates/esdmd/hhp/biostatistics-and-data-science/"
      },
      {
        "website": "NASA",
        "title": "One of NASA’s Key Cameras Orbiting Mars Takes 100,000th Image",
        "pubDate": "Tue, 16 Dec 2025 16:00:00 +0000",
        "description": "Mesas and dunes stand out in the view snapped by HiRISE, one of the imagers aboard the agency’s Mars Reconnaissance Orbiter. After nearly 20 years at the Red Planet, NASA’s Mars Reconnaissance Orbiter (MRO) has snapped its 100,000th image of the surface with its HiRISE camera. Short for High Resolution Imaging Science Experiment, HiRISE is […]",
        "link": "https://www.nasa.gov/missions/mars-reconnaissance-orbiter/one-of-nasas-key-cameras-orbiting-mars-takes-100000th-image/"
      }
    ]
  }
}
```

---

## Error Handling

The API client provides comprehensive error handling through the `RsstojsonAPIClientError` exception. Here are some examples:

### Basic Error Handling

```python
from apiverve_rsstojson.apiClient import RsstojsonAPIClient, RsstojsonAPIClientError

api = RsstojsonAPIClient("[YOUR_API_KEY]")

query = { "url": "https://www.nasa.gov/rss/dyn/breaking_news.rss" }

try:
    result = api.execute(query)
    print("Success!")
    print(result)
except RsstojsonAPIClientError as e:
    print(f"API Error: {e.message}")
    if e.status_code:
        print(f"Status Code: {e.status_code}")
    if e.response:
        print(f"Response: {e.response}")
```

### Handling Specific Error Types

```python
from apiverve_rsstojson.apiClient import RsstojsonAPIClient, RsstojsonAPIClientError

api = RsstojsonAPIClient("[YOUR_API_KEY]")

query = { "url": "https://www.nasa.gov/rss/dyn/breaking_news.rss" }

try:
    result = api.execute(query)

    # Check for successful response
    if result.get('status') == 'success':
        print("Request successful!")
        print(result.get('data'))
    else:
        print(f"API returned an error: {result.get('error')}")

except RsstojsonAPIClientError as e:
    # Handle API client errors
    if e.status_code == 401:
        print("Unauthorized: Invalid API key")
    elif e.status_code == 429:
        print("Rate limit exceeded")
    elif e.status_code >= 500:
        print("Server error - please try again later")
    else:
        print(f"API error: {e.message}")
except Exception as e:
    # Handle unexpected errors
    print(f"Unexpected error: {str(e)}")
```

### Using Context Manager (Recommended)

The client supports the context manager protocol for automatic resource cleanup:

```python
from apiverve_rsstojson.apiClient import RsstojsonAPIClient, RsstojsonAPIClientError

query = { "url": "https://www.nasa.gov/rss/dyn/breaking_news.rss" }

# Using context manager ensures proper cleanup
with RsstojsonAPIClient("[YOUR_API_KEY]") as api:
    try:
        result = api.execute(query)
        print(result)
    except RsstojsonAPIClientError as e:
        print(f"Error: {e.message}")
# Session is automatically closed here
```

---

## Advanced Features

### Debug Mode

Enable debug logging to see detailed request and response information:

```python
from apiverve_rsstojson.apiClient import RsstojsonAPIClient

# Enable debug mode
api = RsstojsonAPIClient("[YOUR_API_KEY]", debug=True)

query = { "url": "https://www.nasa.gov/rss/dyn/breaking_news.rss" }

# Debug information will be printed to console
result = api.execute(query)
```

### Manual Session Management

If you need to manually manage the session lifecycle:

```python
from apiverve_rsstojson.apiClient import RsstojsonAPIClient

api = RsstojsonAPIClient("[YOUR_API_KEY]")

query = { "url": "https://www.nasa.gov/rss/dyn/breaking_news.rss" }

try:
    result = api.execute(query)
    print(result)
finally:
    # Manually close the session when done
    api.close()
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=pypi&utm_medium=referral&utm_content=readme).

---

## Updates
Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=pypi&utm_medium=referral&utm_content=readme) and all legal documents and agreements.

---

## License
Licensed under the MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
