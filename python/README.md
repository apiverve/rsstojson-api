RSS to JSON API
============

RSS to JSON is a simple tool for converting RSS feeds into JSON format. It returns the RSS feed in JSON format.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a Python API Wrapper for the [RSS to JSON API](https://apiverve.com/marketplace/rsstojson?utm_source=pypi&utm_medium=readme)

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

Before using the rsstojson API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=pypi&utm_medium=readme)

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

The RSS to JSON API documentation is found here: [https://docs.apiverve.com/ref/rsstojson](https://docs.apiverve.com/ref/rsstojson?utm_source=pypi&utm_medium=readme).
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
        "title": "60 Years Ago: Ranger 8 Moon Photos Aid in Apollo Site Selection ",
        "pubDate": "Thu, 20 Feb 2025 20:59:33 +0000",
        "description": "Before Apollo astronauts set foot upon the Moon, much remained unknown about the lunar surface. While most scientists believed the Moon had a solid surface that would support astronauts and their landing craft, a few believed a deep layer of dust covered it that would swallow any visitors. Until 1964, no closeup photographs of the […]",
        "link": "https://www.nasa.gov/history/60-years-ago-ranger-8-moon-photos-aid-in-apollo-site-selection/"
      },
      {
        "website": "NASA",
        "title": "55 Years Ago: Preps for Apollo 13 and 14, Apollo 12 Crew on World Tour",
        "pubDate": "Thu, 20 Feb 2025 19:06:38 +0000",
        "description": "With two months to go before flight, the Apollo 13 prime crew of James Lovell, Thomas Mattingly, Fred Haise, and backups John Young, John Swigert, and Charles Duke continued to train for the 10-day mission planned to land in the Fra Mauro highlands region of the Moon. Engineers continued to prepare the Saturn V rocket […]",
        "link": "https://www.nasa.gov/history/55-years-ago-preps-for-apollo-13-and-14-apollo-12-crew-on-world-tour/"
      },
      {
        "website": "NASA",
        "title": "NASA Invites Media to Simulated Mars Habitat Before Next Mission",
        "pubDate": "Thu, 20 Feb 2025 19:02:19 +0000",
        "description": "Media are invited to visit NASA’s simulated Mars habitat on Monday, March 10, at the agency’s Johnson Space Center in Houston. The simulation will help prepare humanity for future missions to the Red Planet. This is the second of three missions as part of NASA’s CHAPEA (Crew Health and Performance Exploration Analog), set to begin […]",
        "link": "https://www.nasa.gov/news-release/nasa-invites-media-to-simulated-mars-habitat-before-next-mission/"
      },
      {
        "website": "NASA",
        "title": "In Memoriam: Jeff Dozier [1944–2024]",
        "pubDate": "Thu, 20 Feb 2025 18:55:58 +0000",
        "description": "Jeff Dozier, an environmental scientist, snow hydrologist, researcher, academic – and former Earth Observing System Project Scientist – died on November 17, 2024. Jeff’s research focused on snow hydrology and biogeochemistry in mountain environments and addressed the role of stored and melting snow in the hydrologic cycle as well as the economic and social impact […]",
        "link": "https://science.nasa.gov/science-research/earth-science/in-memoriam-jeff-dozier-1944-2024/"
      },
      {
        "website": "NASA",
        "title": "In Memoriam: Berrien Moore III [1941–2024]",
        "pubDate": "Thu, 20 Feb 2025 18:54:46 +0000",
        "description": "Berrien Moore III, Dean of the College of Atmospheric and Geographic Sciences at the University of Oklahoma (OU), director of the National Weather Center in Norman, OK, and Vice President for Weather and Climate Programs, died on December 17, 2024. Berrien earned an undergraduate degree from the University of North Carolina in 1963 and a doctorate […]",
        "link": "https://science.nasa.gov/science-research/earth-science/in-memoriam-berrien-moore-iii-1941-2024/"
      },
      {
        "website": "NASA",
        "title": "Artemis II Rocket Booster Stacking Complete",
        "pubDate": "Thu, 20 Feb 2025 16:52:15 +0000",
        "description": "Engineers at NASA’s Kennedy Space Center in Florida completed stacking the twin SLS (Space Launch System) solid rocket boosters – seen in this Feb. 19, 2025, photo – inside the Vehicle Assembly Building for the agency’s Artemis II crewed test flight around the Moon. During stacking operations, which began Nov. 20, 2024, technicians used a massive overhead crane to […]",
        "link": "https://www.nasa.gov/image-article/artemis-ii-rocket-booster-stacking-complete/"
      },
      {
        "website": "NASA",
        "title": "NASA Stennis Teams Install New Production RS-25 Engine for Upcoming Hot Fire",
        "pubDate": "Thu, 20 Feb 2025 16:04:38 +0000",
        "description": "NASA marked a key milestone Feb. 18 with installation of RS-25 engine No. E20001, the first new production engine to help power the SLS (Space Launch System) rocket on future Artemis missions to the Moon. The engine, built by lead SLS engines contractor L3Harris (formerly Aerojet Rocketdyne), was installed on the Fred Haise Test Stand […]",
        "link": "https://www.nasa.gov/image-article/stennis-teams-install-new-production-rs-25-engine/"
      },
      {
        "website": "NASA",
        "title": "In Memoriam: Pierre Morel [1933–2024]",
        "pubDate": "Thu, 20 Feb 2025 14:54:30 +0000",
        "description": "Pierre Morel, the first director of the World Climate Research Programme (WCRP) and founding member of WCRP’s Global Energy and Water Exchanges (GEWEX) Core project, died on December 10, 2024. Pierre began his research as a theoretical physicist. His doctoral thesis examined the existence and properties of a condensed superfluid state of liquid Helium 3 […]",
        "link": "https://science.nasa.gov/science-research/earth-science/in-memoriam-pierre-morel-1933-2024/"
      },
      {
        "website": "NASA",
        "title": "Lunar Cold Electronics Assessment Workshop (Apr 30 – May 1, 2025)",
        "pubDate": "Thu, 20 Feb 2025 14:53:08 +0000",
        "description": "How to Attend The workshop will be hosted by NASA Jet Propulsion Laboratory.Virtual and in-person attendance are available. Registration is required for both. (Link coming soon!)Virtual attendees will receive connection information one week before the workshop. Background, Goals and Objectives Preliminary Agenda Points of Contact If you have any questions regarding the workshop, please contact […]",
        "link": "https://www.nasa.gov/centers-and-facilities/nesc/lunar-cold-electronics-assessment-workshop/"
      },
      {
        "website": "NASA",
        "title": "Summary of the Joint NASA LCLUC–SARI Synthesis Meeting",
        "pubDate": "Thu, 20 Feb 2025 14:52:36 +0000",
        "description": "Introduction The NASA Land-Cover and Land-Use Change (LCLUC) is an interdisciplinary scientific program within NASA’s Earth Science program that aims to develop the capability for periodic global inventories of land use and land cover from space. The program’s goal is to develop the mapping, monitoring and modeling capabilities necessary to simulate the processes taking place and […]",
        "link": "https://science.nasa.gov/science-research/earth-science/summary-of-the-joint-nasa-lcluc-sari-synthesis-meeting/"
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

try:
    query = { "url": "https://www.nasa.gov/rss/dyn/breaking_news.rss" }
    result = api.execute(query)
    print(result)
finally:
    # Manually close the session when done
    api.close()
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=pypi&utm_medium=readme).

---

## Updates
Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=pypi&utm_medium=readme) and all legal documents and agreements.

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
