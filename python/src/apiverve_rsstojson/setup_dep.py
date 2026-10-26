from setuptools import setup, find_packages

setup(
    name='apiverve_rsstojson',
    version='1.2.3',
    packages=find_packages(),
    include_package_data=True,
    install_requires=[
        'requests',
        'setuptools'
    ],
    description='RSS to JSON converts any RSS feed URL into structured JSON in real time. Each response returns the source domain, article counts, headlines, publication dates, summaries, and direct article links.',
    author='APIVerve',
    author_email='hello@apiverve.com',
    url='https://apiverve.com/marketplace/rsstojson?utm_source=pypi&utm_medium=referral&utm_content=homepage',
    classifiers=[
        'Programming Language :: Python :: 3',
        'Operating System :: OS Independent',
    ],
    python_requires='>=3.6',
)
